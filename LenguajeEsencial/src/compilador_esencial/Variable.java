package compilador_esencial;

public class Variable {
	
	private String Nombre;
	private int Valor = 0;
	
	public Variable(String nombre, int valor) {
		Nombre = nombre;
		Valor = valor;
	}
	
	public Variable(String nombre) {
		Nombre = nombre;
	}
		
	public void SetValor(int valor) {
		Valor = valor;
	}
	
	public String GetNombre() {
		return Nombre;
	}
	
	public int GetValor() {
		return Valor;	
	}
	
	public void Incrementar() {
		Valor++;		
	}
	
	public void Decrementar() {
		if(Valor > 0) Valor--;		
	}

}
