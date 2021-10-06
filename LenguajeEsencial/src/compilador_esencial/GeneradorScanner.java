package compilador_esencial;

public class GeneradorScanner {

	public static void main(String[] args) throws Exception {
		String opciones[] = new String[] {"-d", "src/compilador_esencial" ,"src/compilador_esencial/Esencial.jflex"};
		jflex.Main.generate(opciones);		
	}

}
