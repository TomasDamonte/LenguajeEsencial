package compilador_esencial;

import java.util.ArrayList;

public class ListaVariables {
	
	private static ArrayList<Variable> variables = new ArrayList<>();
	
	public static void actualizarVariable(Variable var) {
		for(Variable v : variables) {
			if(v.getNombre().equals(var.getNombre())) v.setValor(var.getValor());
		}
	}
	
	public static Variable obtenerVariable(String nombre) {
		for(Variable v : variables) {
			if(v.getNombre().equals(nombre)) return v;
		}
		return null;
	}
	
	public static Variable crearVariable(String nombre) {
		Variable var = new Variable(nombre);
		ListaVariables.variables.add(var);
		return var;
	}
	
	public static Variable obtenerOCrearVariable(String nombre) {
		Variable v = obtenerVariable(nombre);
		if(v != null) return v;
		else return crearVariable(nombre);
	}


}
