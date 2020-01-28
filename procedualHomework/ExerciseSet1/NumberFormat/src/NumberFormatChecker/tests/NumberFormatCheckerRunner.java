package NumberFormatChecker.tests;



import java.util.Locale;


public class NumberFormatCheckerRunner {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US", "en"));
		//System.out.printf("[NumberFormatCheckerRunner] calling NumberFormatChecker.Main.main: ");
		NumberFormatChecker.Main.main(args);

	}

}
