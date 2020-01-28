package HelloWorld.tests;



import java.util.Locale;


public class HelloWorldRunner {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US", "en"));
		//System.out.printf("[HelloWorldRunner] calling HelloWorld.Main.main: ");
		HelloWorld.Main.main(args);

	}

}
