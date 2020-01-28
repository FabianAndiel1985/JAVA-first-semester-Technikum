package Karte.tests;



import java.util.Locale;


public class KarteRunner {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US", "en"));
		//System.out.printf("[KarteRunner] calling Karte.Main.main: ");
		Karte.Main.main(args);

	}

}
