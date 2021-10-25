package compilador_esencial;

import java.util.HashMap;

public class ListaVariables {

	private static HashMap<String, Integer> variables = new HashMap<>();
	
	public static Variable crearVariable(String nombreVariable) {
		Variable var = new Variable(nombreVariable);
		variables.put(var.getNombre(),var.getValor());
		return var;
	}

	public static Variable obtenerOCrearVariable(String nombreVariable) {
		Variable v = obtenerVariable(nombreVariable);
		if(v != null) return v;
		return crearVariable(nombreVariable);
	}

	public static Variable obtenerVariable(String nombreVariable) {
		if (variables.get(nombreVariable) == null) return null;
		return new Variable(nombreVariable, variables.get(nombreVariable));
	}

	public static void actualizarVariable(Variable var) {
		variables.put(var.getNombre(), var.getValor());
	}

}
