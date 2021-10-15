package compilador_esencial;

public class Decremento implements Instruccion {

	private String Variable;
	
	public Decremento(String v) {
		Variable = v;
	}
	
	@Override
	public void Ejecutar() {
		Variable v = ListaVariables.ObtenerOCrearVariable(Variable);
		v.Decrementar();
		ListaVariables.ActualizarVariable(v);
	}

}
