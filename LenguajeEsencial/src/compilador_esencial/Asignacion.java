package compilador_esencial;

public class Asignacion implements Ejecutable {
	
	private String nombreVariable;
	private int valorVariable;
	private String nombreVariableAsignacion;
	
	public Asignacion(String nombreVariable, int valorVariable) {
		this.nombreVariable = nombreVariable;
		this.valorVariable = valorVariable;
	}
	
	public Asignacion(String nombreVariable, String nombreVariableAsignacion) {
		this.nombreVariable =  nombreVariable;
		this.nombreVariableAsignacion = nombreVariableAsignacion;
	}
	
	@Override
	public void ejecutar() {
		Variable v = ListaVariables.obtenerOCrearVariable(nombreVariable);
		if(nombreVariableAsignacion == null) v.setValor(valorVariable);
		else {
			Variable v2 = ListaVariables.obtenerVariable(nombreVariableAsignacion);
			if(v2 != null) v.setValor(v2.getValor());
			else v.setValor(0);
		}
		ListaVariables.actualizarVariable(v);
	}

}
