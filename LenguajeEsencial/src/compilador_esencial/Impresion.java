package compilador_esencial;

import java.util.ArrayList;

public class Impresion implements Ejecutable {

	private ArrayList<String> variables;
	
	public Impresion(ArrayList<String> vars) {
		variables = new ArrayList<>(vars);
	}
	
	@Override
	public void ejecutar() {
		for(String va : variables) {
			Variable v = ListaVariables.obtenerVariable(va);
			if(v != null) System.out.println(v.getNombre() + " = " + v.getValor());
		}		
	}

}
