package compilador_esencial;

import java.io.FileReader;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)  {
		try {
			new Parser(new Scanner(new FileReader("res/programa.txt"))).parse();
		}  catch (Exception e) {			
			e.printStackTrace();
		}

	}

}
