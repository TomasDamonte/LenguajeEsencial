package compilador_esencial;

import java.util.ArrayList;

public class ListaVariables {
	
	private static ArrayList<Variable> variables = new ArrayList<>();
	
	public static void actualizarVariable(Variable var) {
		for(Variable v : variables) {
			if(v.getNombre().equals(var.getNombre())) v.setValor(var.getValor());
		}
	}
	
	public static Variable obtenerVariable(String nombreVariable) {
		for(Variable v : variables) {
			if(v.getNombre().equals(nombreVariable)) return v;
		}
		return null;
	}
	
	public static Variable crearVariable(String nombreVariable) {
		Variable var = new Variable(nombreVariable);
		ListaVariables.variables.add(var);
		return var;
	}
	
	public static Variable obtenerOCrearVariable(String nombreVariable) {
		Variable v = obtenerVariable(nombreVariable);
		if(v != null) return v;
		return crearVariable(nombreVariable);
	}


}
