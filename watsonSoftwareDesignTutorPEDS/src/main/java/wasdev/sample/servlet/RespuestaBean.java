package wasdev.sample.servlet;

import java.io.Serializable;

public class RespuestaBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String respuesta;

	public RespuestaBean()
	{
	}

	public String getRespuesta() 
	{
		return respuesta;
	}

	public void setRespuesta(String pRespuesta)
	{
		this.respuesta = pRespuesta;
	}
	
	

}
