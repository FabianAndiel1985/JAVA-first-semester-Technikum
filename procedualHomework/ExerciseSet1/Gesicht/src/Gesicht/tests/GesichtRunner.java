package Gesicht.tests;



import java.util.Locale;


public class GesichtRunner {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US", "en"));
		//System.out.printf("[GesichtRunner] calling Gesicht.Main.main: ");
		Gesicht.Main.main(args);

	}

}
