package LogicaDeNegocios1;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ibm.watson.developer_cloud.conversation.v1.ConversationService;
import com.ibm.watson.developer_cloud.conversation.v1.model.Intent;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageRequest;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse;


public class Conversacion extends ServicioWatson{
	
	private ConversationService servicioConversacion;
	private String espacioTrabajo;
	
	public Conversacion(String pNombreUsuario, String pContrasena, String pEspacioTrabajo)
	{
		super(pNombreUsuario, pContrasena);
		espacioTrabajo = pEspacioTrabajo;
		servicioConversacion =  new ConversationService(ConversationService.VERSION_DATE_2016_07_11);
		servicioConversacion.setUsernameAndPassword(nombreUsuario, contrasena);

	}
	
	public String consultarPregunta(String pPregunta)
	{

	    MessageRequest nuevoMensaje = new MessageRequest.Builder().inputText(pPregunta).build();  
	    MessageResponse respuesta = servicioConversacion.message(espacioTrabajo, nuevoMensaje).execute();
	    return procesarRespuestaJson(respuesta.toString());

	}
	
	public String procesarRespuestaJson(String pRespuestaJson)
	{
		
		JsonElement jelement = new JsonParser().parse(pRespuestaJson);
	    JsonObject  jobject = jelement.getAsJsonObject();
	    
	    jelement = jobject.get("output");
	    jobject = jelement.getAsJsonObject();
	    
	    JsonArray jarray = jobject.getAsJsonArray("text");
	    
	    if(jarray.size()>0)
	    	return jarray.get(0).toString();
	    else
	    	return "No se encontró una respuesta valida para la pregunta.";
	}
	
}
