package compilador_esencial;

public class Incremento implements Ejecutable {

	private String nombreVariable;
	
	public Incremento(String nombreVariable) {
		this.nombreVariable = nombreVariable;
	}
	
	@Override
	public void ejecutar() {
		Variable v = ListaVariables.obtenerOCrearVariable(nombreVariable);
		v.incrementar();
		ListaVariables.actualizarVariable(v);
	}

}
