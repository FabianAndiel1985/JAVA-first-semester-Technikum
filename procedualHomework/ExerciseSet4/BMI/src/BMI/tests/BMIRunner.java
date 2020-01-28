package BMI.tests;



import java.util.Locale;


public class BMIRunner {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US", "en"));
		//System.out.printf("[BMIRunner] calling BMI.Main.main: ");
		BMI.Main.main(args);

	}

}
