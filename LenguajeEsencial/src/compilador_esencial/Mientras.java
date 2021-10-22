package compilador_esencial;

import java.util.ArrayList;

public class Mientras implements Ejecutable {

	private String variableCondicion;
	private ArrayList<Ejecutable> instrucciones;
	
	public Mientras(String variableCondicion, ArrayList<Ejecutable> instrucciones) {
		this.variableCondicion = variableCondicion;
		this.instrucciones = instrucciones;
	}
	
	@Override
	public void ejecutar() {
		while(ListaVariables.obtenerOCrearVariable(variableCondicion).getValor() != 0) {
			for(Ejecutable i : instrucciones) {
				i.ejecutar();
			}
		}
	}

}
