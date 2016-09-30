package LogicaDeNegocios;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ibm.watson.developer_cloud.conversation.v1.ConversationService;
import com.ibm.watson.developer_cloud.conversation.v1.model.Intent;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageRequest;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse;


public class Conversacion {
	
	private ConversationService service;
	private String espacioTrabajo;
	private String respuesta;
	
	
	public Conversacion(String pNombreUsuario, String pContraseña, String pEspacioTrabajo)
	{
		espacioTrabajo = pEspacioTrabajo;
		service =  new ConversationService(ConversationService.VERSION_DATE_2016_07_11);
		service.setUsernameAndPassword(pNombreUsuario, pContraseña);

	}
	
	public String consultarPregunta(String pPregunta)
	{

	    MessageRequest nuevoMensaje = new MessageRequest.Builder().inputText(pPregunta).build();  
	    MessageResponse respuesta = service.message(espacioTrabajo, nuevoMensaje).execute();
	    return obtenerRespuesta(respuesta.toString());

	}
	
	public String obtenerRespuesta(String pRespuestaJson)
	{
		
		JsonElement jelement = new JsonParser().parse(pRespuestaJson);
	    JsonObject  jobject = jelement.getAsJsonObject();
	    
	    jelement = jobject.get("output");
	    jobject = jelement.getAsJsonObject();
	    
	    JsonArray jarray = jobject.getAsJsonArray("text");
	    
	    if(jarray.size()>0)
	    	return respuesta = jarray.get(0).toString();
	    else
	    	return respuesta = "No se encontró una respuesta valida para la pregunta.";
	}
	
	public String getRespuesta()
	{
		return respuesta;
	}
	

}
