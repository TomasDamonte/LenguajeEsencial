package compilador_esencial;

public class Asignacion implements Instruccion {
	
	private String Variable;
	private int Valor;
	private String VariableAsignacion;
	
	public Asignacion(String v, int valor) {
		Variable = v;
		Valor = valor;
	}
	
	public Asignacion(String v, String v2) {
		Variable = v;
		VariableAsignacion = v2;
	}
	
	@Override
	public void Ejecutar() {
		Variable v = ListaVariables.ObtenerOCrearVariable(Variable);
		if(VariableAsignacion == null) v.SetValor(Valor);
		else {
			Variable v2 = ListaVariables.ObtenerVariable(VariableAsignacion);			
			if(v2 != null) v.SetValor(v2.GetValor());
			else v.SetValor(0);
		}
		ListaVariables.ActualizarVariable(v);
	}

}
