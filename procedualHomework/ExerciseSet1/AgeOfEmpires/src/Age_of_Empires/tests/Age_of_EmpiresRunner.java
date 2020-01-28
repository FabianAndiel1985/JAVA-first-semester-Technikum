package Age_of_Empires.tests;



import java.util.Locale;


public class Age_of_EmpiresRunner {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US", "en"));
		//System.out.printf("[Age_of_EmpiresRunner] calling Age_of_Empires.Main.main: ");
		Age_of_Empires.Main.main(args);

	}

}
