package LogicaDeNegocios1;

import java.io.File;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ibm.watson.developer_cloud.speech_to_text.v1.SpeechToText;
import com.ibm.watson.developer_cloud.speech_to_text.v1.model.SpeechResults;


public class VozATexto {
	
	SpeechToText serviceVozTexto; 
	
	public VozATexto(String pNombreUsuario, String pContrasena){
		
		serviceVozTexto =  new SpeechToText();
		serviceVozTexto.setUsernameAndPassword(pNombreUsuario, pContrasena);
	}
	public void convertirVozTexto(String pRuta){
		
	
		SpeechResults resultado =  serviceVozTexto.recognize(new File(pRuta)).execute();
		System.out.println(obtenerRespuesta(resultado.toString()));
		
	}
	public String obtenerRespuesta(String pRespuesta)
	{
		
		JsonElement jelement = new JsonParser().parse(pRespuesta);
	    JsonObject  jobject = jelement.getAsJsonObject();
	    
	    JsonArray jarray = jobject.getAsJsonArray("results");
	    jelement = jarray.get(0);
	    jobject = jelement.getAsJsonObject();
	    
	    JsonArray jarray2 = jobject.getAsJsonArray("alternatives");
	    jelement = jarray2.get(0);
	    jobject = jelement.getAsJsonObject();
	    String respuesta = jobject.get("transcript").toString();
	    return respuesta;	
	    
	}

}