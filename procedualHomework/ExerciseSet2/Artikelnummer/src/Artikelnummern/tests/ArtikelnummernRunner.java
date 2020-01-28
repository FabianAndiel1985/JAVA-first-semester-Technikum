package Artikelnummern.tests;



import java.util.Locale;


public class ArtikelnummernRunner {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US", "en"));
		//System.out.printf("[ArtikelnummernRunner] calling Artikelnummern.Main.main: ");
		Artikelnummern.Main.main(args);

	}

}
