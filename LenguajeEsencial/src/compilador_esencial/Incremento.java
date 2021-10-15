package compilador_esencial;

public class Incremento implements Instruccion {

	private String Variable;
	
	public Incremento(String v) {
		Variable = v;
	}
	
	@Override
	public void Ejecutar() {
		Variable v = ListaVariables.ObtenerOCrearVariable(Variable);
		v.Incrementar();
		ListaVariables.ActualizarVariable(v);
	}

}
