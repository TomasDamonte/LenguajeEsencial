package compilador_esencial;

import java.util.ArrayList;

public class ListaVariables {
	
	private static ArrayList<Variable> Variables = new ArrayList<Variable>();
	
	public static void ActualizarVariable(Variable var) {
		for(Variable v : Variables) {
			if(v.GetNombre().equals(var.GetNombre())) v.SetValor(var.GetValor());
		}
	}
	
	public static Variable ObtenerVariable(String nombre) {
		for(Variable v : Variables) {
			if(v.GetNombre().equals(nombre)) return v;
		}
		return null;
	}
	
	public static Variable CrearVariable(String nombre) {
		Variable var = new Variable(nombre);
		ListaVariables.Variables.add(var);
		return var;
	}
	
	public static Variable ObtenerOCrearVariable(String nombre) {
		Variable v = ObtenerVariable(nombre);
		if(v != null) return v;
		else return CrearVariable(nombre);
	}
	
	public static void ImprimirVariables() {
		for(Variable v : Variables) {
   			System.out.println(v.GetNombre() + " = " + v.GetValor());
   		}
	}

}
