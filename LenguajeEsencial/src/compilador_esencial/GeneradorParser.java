package compilador_esencial;

public class GeneradorParser {

	public static void main(String[] args) throws Exception {
		String[] opciones = new String[] {"-destdir", "src/compilador_esencial" , "-parser", "Parser", "src/compilador_esencial/Esencial.cup"};
		java_cup.Main.main(opciones);
	}
}
