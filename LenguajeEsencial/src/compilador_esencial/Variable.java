package compilador_esencial;

public class Variable {
	
	private String nombre;
	private int valor = 0;
	
	public Variable(String nombre, int valor) {
		this.nombre = nombre;
		this.valor = valor;
	}
	
	public Variable(String nombre) {
		this.nombre = nombre;
	}
		
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getValor() {
		return valor;
	}
	
	public void incrementar() {
		valor++;
	}
	
	public void decrementar() {
		if(valor > 0) valor--;
	}

}
