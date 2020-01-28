package Noten.tests;



import java.util.Locale;


public class NotenRunner {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US", "en"));
		//System.out.printf("[NotenRunner] calling Noten.Main.main: ");
		Noten.Main.main(args);

	}

}
