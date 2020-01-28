package OneMonthCalendar.tests;



import java.util.Locale;


public class OneMonthCalendarRunner {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US", "en"));
		//System.out.printf("[OneMonthCalendarRunner] calling OneMonthCalendar.Main.main: ");
		OneMonthCalendar.Main.main(args);

	}

}
