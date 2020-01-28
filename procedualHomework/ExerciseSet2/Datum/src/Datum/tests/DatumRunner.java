package Datum.tests;



import java.util.Locale;


public class DatumRunner {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US", "en"));
		//System.out.printf("[DatumRunner] calling Datum.Main.main: ");
		Datum.Main.main(args);

	}

}
