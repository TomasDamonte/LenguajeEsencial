package compilador_esencial;

public class Decremento implements Ejecutable {

	private String nombreVariable;
	
	public Decremento(String nombreVariable) {
		this.nombreVariable = nombreVariable;
	}
	
	@Override
	public void ejecutar() {
		Variable v = ListaVariables.obtenerOCrearVariable(nombreVariable);
		v.decrementar();
		ListaVariables.actualizarVariable(v);
	}

}
