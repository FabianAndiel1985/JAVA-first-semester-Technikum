package MalReihe.tests;



import java.util.Locale;


public class MalReiheRunner {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US", "en"));
		//System.out.printf("[MalReiheRunner] calling MalReihe.Main.main: ");
		MalReihe.Main.main(args);

	}

}
