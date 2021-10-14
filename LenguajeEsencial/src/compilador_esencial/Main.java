package compilador_esencial;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;

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
			
			Iterator<String> it = variables.keySet().iterator();
			while(it.hasNext())
			{
				String key = it.next();
				System.out.println(key + " = " + variables.get(key));
			}
			*/
		}		
		catch (Exception e) 
		{			
			e.printStackTrace();
		}
	}
	
	public static void Asignar(String id, Integer valor)
   	{
		if(id == null || id.trim().equals("")) return;
   		if(variables.containsKey(id)) variables.remove(id);   		
   		variables.put(id,valor);   		
   	}
}
