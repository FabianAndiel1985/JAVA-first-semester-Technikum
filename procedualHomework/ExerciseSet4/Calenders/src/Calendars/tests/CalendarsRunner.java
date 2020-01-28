package Calendars.tests;



import java.util.Locale;


public class CalendarsRunner {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US", "en"));
		//System.out.printf("[CalendarsRunner] calling Calendars.Main.main: ");
		Calendars.Main.main(args);

	}

}
