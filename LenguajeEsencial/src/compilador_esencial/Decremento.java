package compilador_esencial;

public class Decremento implements Instruccion {

	private String variable;
	
	public Decremento(String v) {
		variable = v;
	}
	
	@Override
	public void ejecutar() {
		Variable v = ListaVariables.obtenerOCrearVariable(variable);
		v.decrementar();
		ListaVariables.actualizarVariable(v);
	}

}
