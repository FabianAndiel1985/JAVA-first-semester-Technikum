package Oktal.tests;



import java.util.Locale;


public class OktalRunner {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US", "en"));
		//System.out.printf("[OktalRunner] calling Oktal.Main.main: ");
		Oktal.Main.main(args);

	}

}
