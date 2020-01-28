package EscapeCharacters.tests;



import java.util.Locale;


public class EscapeCharactersRunner {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US", "en"));
		//System.out.printf("[EscapeCharactersRunner] calling EscapeCharacters.Main.main: ");
		EscapeCharacters.Main.main(args);

	}

}
