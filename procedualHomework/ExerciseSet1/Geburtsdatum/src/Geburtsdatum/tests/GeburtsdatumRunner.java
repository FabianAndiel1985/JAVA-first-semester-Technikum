package Geburtsdatum.tests;



import java.util.Locale;


public class GeburtsdatumRunner {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US", "en"));
		//System.out.printf("[GeburtsdatumRunner] calling Geburtsdatum.Main.main: ");
		Geburtsdatum.Main.main(args);

	}

}
