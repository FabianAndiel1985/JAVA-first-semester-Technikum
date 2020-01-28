package Rechengitter.tests;



import java.util.Locale;


public class RechengitterRunner {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US", "en"));
		//System.out.printf("[RechengitterRunner] calling Rechengitter.Main.main: ");
		Rechengitter.Main.main(args);

	}

}
