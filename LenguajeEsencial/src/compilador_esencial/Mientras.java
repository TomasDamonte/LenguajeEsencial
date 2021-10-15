package compilador_esencial;

import java.util.ArrayList;

public class Mientras implements Instruccion {

	private String Condicion;
	private ArrayList<Instruccion> Instrucciones;
	
	public Mientras(String cond, ArrayList<Instruccion> inst) {
		Condicion = cond;
		Instrucciones = inst;
	}
	
	@Override
	public void Ejecutar() {
		while(ListaVariables.ObtenerOCrearVariable(Condicion).GetValor() != 0) {
			for(Instruccion i : Instrucciones) {
				i.Ejecutar();
			}
		}
	}

}
