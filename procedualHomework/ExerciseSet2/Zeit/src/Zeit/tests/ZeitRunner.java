package Zeit.tests;



import java.util.Locale;


public class ZeitRunner {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US", "en"));
		//System.out.printf("[ZeitRunner] calling Zeit.Main.main: ");
		Zeit.Main.main(args);

	}

}
