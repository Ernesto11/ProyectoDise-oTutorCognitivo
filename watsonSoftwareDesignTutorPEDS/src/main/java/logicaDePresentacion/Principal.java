package logicaDePresentacion;



import LogicaDeNegocios.Conversacion;
import LogicaDeNegocios.Traducir;


public class Principal 
{

	public static void main(String[] args) {
		
		//Conversacion p = new Conversacion("35a4cbe1-56ec-4f9e-8b2a-ef80d3a77521","01sumefaccpZ","bea3b85e-8324-47b2-8072-460c6543ab76");
		//p.consultarPregunta("que es abstracción");
		//System.out.println(p.obtenerRespuesta());
		
		Traducir p = new Traducir("11e3e5eb-5665-466a-9891-b09fb25f50bb","BGIGbBhCCFgx");
		System.out.println(p.traducirEspañolIngles(""));
	}

}
