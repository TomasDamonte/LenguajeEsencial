package compilador_esencial;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Main 
{	
	
	static HashMap<String, Integer> variables = new HashMap<String, Integer>();
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args)  
	{
		try 
		{
			new Parser(new Scanner(new FileReader("res/programa.txt"))).parse();		
			
			
			/*
			Asignar("a",89);
			Asignar("b",9);
			Asignar(" ",4);
			Incrementar("a");
			Decrementar("b");
			Incrementar("c");
			ImprimirVariables();
			*/
		}		
		catch (Exception e) 
		{			
			e.printStackTrace();
		}
	}
	
	public static void Decrementar(String id)
   	{
   		if(id == null) return;
   		variables.putIfAbsent(id, 0);   		
   		Asignar(id, variables.get(id) - 1);
   	}
   	
   	public static void Incrementar(String id)
   	{
   		if(id == null) return;
   		variables.putIfAbsent(id, 0);
   		Asignar(id, variables.get(id) + 1);
   	}
	
	public static void Asignar(String id, Integer valor)
   	{
		if(id == null || id.trim().equals("")) return;
   		if(variables.containsKey(id)) variables.remove(id);   		
   		variables.put(id,valor);   		
   	}
	
	public static void ImprimirVariables()
   	{
   		Iterator<String> it = variables.keySet().iterator();
		while(it.hasNext())
		{
			String key = it.next();
			System.out.println(key + " = " + variables.get(key));
		}
   	}
}
