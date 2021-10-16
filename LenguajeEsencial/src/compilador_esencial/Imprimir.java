package compilador_esencial;

import java.util.ArrayList;

public class Imprimir implements Instruccion {

	private ArrayList<String> Variables;
	
	public Imprimir(ArrayList<String> vars) {
		Variables = new ArrayList<String>(vars);
	}
	
	@Override
	public void Ejecutar() {		
		for(String va : Variables) {
			Variable v = ListaVariables.ObtenerVariable(va);
			if(v != null) {
				System.out.println(v.GetNombre() + " = " + v.GetValor());
			}
		}		
	}

}
