package compilador_esencial;

public class Incremento implements Instruccion {

	private String variable;
	
	public Incremento(String v) {
		variable = v;
	}
	
	@Override
	public void ejecutar() {
		Variable v = ListaVariables.obtenerOCrearVariable(variable);
		v.incrementar();
		ListaVariables.actualizarVariable(v);
	}

}
