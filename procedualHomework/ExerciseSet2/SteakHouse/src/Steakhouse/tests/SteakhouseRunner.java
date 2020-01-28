package Steakhouse.tests;



import java.util.Locale;


public class SteakhouseRunner {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US", "en"));
		//System.out.printf("[SteakhouseRunner] calling Steakhouse.Main.main: ");
		Steakhouse.Main.main(args);

	}

}
