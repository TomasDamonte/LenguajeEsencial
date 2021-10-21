package compilador_esencial;

public class Asignacion implements Instruccion {
	
	private String variable;
	private int valor;
	private String variableAsignacion;
	
	public Asignacion(String v, int valor) {
		variable = v;
		this.valor = valor;
	}
	
	public Asignacion(String v, String v2) {
		variable = v;
		variableAsignacion = v2;
	}
	
	@Override
	public void ejecutar() {
		Variable v = ListaVariables.obtenerOCrearVariable(variable);
		if(variableAsignacion == null) v.setValor(valor);
		else {
			Variable v2 = ListaVariables.obtenerVariable(variableAsignacion);
			if(v2 != null) v.setValor(v2.getValor());
			else v.setValor(0);
		}
		ListaVariables.actualizarVariable(v);
	}

}
