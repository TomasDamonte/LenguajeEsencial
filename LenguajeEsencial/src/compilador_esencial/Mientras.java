package compilador_esencial;

import java.util.ArrayList;

public class Mientras implements Instruccion {

	private String condicion;
	private ArrayList<Instruccion> instrucciones;
	
	public Mientras(String cond, ArrayList<Instruccion> inst) {
		condicion = cond;
		instrucciones = inst;
	}
	
	@Override
	public void ejecutar() {
		while(ListaVariables.obtenerOCrearVariable(condicion).getValor() != 0) {
			for(Instruccion i : instrucciones) {
				i.ejecutar();
			}
		}
	}

}
