package logicaDePresentacion;



import LogicaDeNegocios.Conversacion;
import LogicaDeNegocios.Traducir;
import LogicaDeNegocios.VozATexto;


public class Principal 
{

	public static void main(String[] args) {
		
		Conversacion poo = new Conversacion("8a14fea8-d65d-4a6e-b0e8-021cce7273cb","ue4A3US7D8Pr","92a995c1-6ec0-454f-a515-e4243b2b13c2");
		
		System.out.println(poo.consultarPregunta("que es una clase"));
		
		//Traducir t = new Traducir("11e3e5eb-5665-466a-9891-b09fb25f50bb","BGIGbBhCCFgx");
		//System.out.println(t.traducirEspañolIngles("Hola"));
		
		//VozATexto tx = new VozATexto("74aabeba-1f39-456b-abcb-05066b333b6a", "Zfw6dHNRTivE");
		//tx.convertirVozTexto();
	}

}
