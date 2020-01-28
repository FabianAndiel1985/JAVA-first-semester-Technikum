package TimeFormatConverter.tests;



import java.util.Locale;


public class TimeFormatConverterRunner {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US", "en"));
		//System.out.printf("[TimeFormatConverterRunner] calling TimeFormatConverter.Main.main: ");
		TimeFormatConverter.Main.main(args);

	}

}
