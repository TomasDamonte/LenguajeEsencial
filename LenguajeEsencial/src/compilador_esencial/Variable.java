package compilador_esencial;

public class Variable {
	
	private String Nombre;
	private int Valor = 0;
	
	public Variable(String nombre, int valor) 
	{
		Nombre = nombre;
		Valor = valor;
	}
	
	public void SetNombre(String nombre) 
	{
		Nombre = nombre;
	}
	
	public void SetValor(int valor) 
	{
		Valor = valor;
	}
	
	public String GetNombre() 
	{
		return Nombre;
	}
	
	public int GetValor() 
	{
		return Valor;	
	}
	
	public void Incr() 
	{
		Valor++;		
	}
	
	public void Decr() 
	{
		if(Valor > 0) Valor--;		
	}

}
