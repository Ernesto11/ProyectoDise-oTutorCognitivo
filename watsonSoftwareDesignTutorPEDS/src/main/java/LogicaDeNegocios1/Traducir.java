package LogicaDeNegocios1;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ibm.watson.developer_cloud.language_translation.v2.LanguageTranslation;
import com.ibm.watson.developer_cloud.language_translation.v2.model.Language;
import com.ibm.watson.developer_cloud.language_translation.v2.model.TranslationResult;

public class Traducir extends ServicioWatson {
	
	LanguageTranslation servicioTraducir;
	
	public Traducir(String pNombreUsuario, String pContrasena)
	{
		super(pNombreUsuario, pContrasena);
		servicioTraducir =  new LanguageTranslation();
		servicioTraducir.setUsernameAndPassword(nombreUsuario, contrasena);
	}
	
	public String traducirEspañolIngles(String pTexto)
	{
	    TranslationResult resultadoTraduccion = servicioTraducir.translate(pTexto,Language.SPANISH,Language.ENGLISH).execute();
	    return procesarRespuestaJson(resultadoTraduccion.toString());
	}
	
	public String procesarRespuestaJson(String pRespuestaJson)
	{
		
		JsonElement jelement = new JsonParser().parse(pRespuestaJson);
	    JsonObject  jobject = jelement.getAsJsonObject();
	    
	    JsonArray jarray = jobject.getAsJsonArray("translations");
	    jelement = jarray.get(0);
	    jobject = jelement.getAsJsonObject();
	    String respuesta = jobject.get("translation").toString();  
	    return respuesta;

	}
	
}
