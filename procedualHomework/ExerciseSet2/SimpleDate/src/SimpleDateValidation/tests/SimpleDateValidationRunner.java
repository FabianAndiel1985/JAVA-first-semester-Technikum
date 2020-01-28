package SimpleDateValidation.tests;



import java.util.Locale;


public class SimpleDateValidationRunner {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US", "en"));
		//System.out.printf("[SimpleDateValidationRunner] calling SimpleDateValidation.Main.main: ");
		SimpleDateValidation.Main.main(args);

	}

}
