package TimeCalculations.tests;



import java.util.Locale;


public class TimeCalculationsRunner {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US", "en"));
		//System.out.printf("[TimeCalculationsRunner] calling TimeCalculations.Main.main: ");
		TimeCalculations.Main.main(args);

	}

}
