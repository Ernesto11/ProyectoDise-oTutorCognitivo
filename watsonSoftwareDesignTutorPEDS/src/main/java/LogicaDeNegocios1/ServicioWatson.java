package LogicaDeNegocios1;

public abstract class ServicioWatson {
	
	protected String nombreUsuario;
	protected String contrasena;
	
	public ServicioWatson(String pNombreUsuario, String pContrasena)
	{
		nombreUsuario = pNombreUsuario;
		contrasena = pContrasena;
	}
	
	public abstract String procesarRespuestaJson(String pRespuestaJson);

}
