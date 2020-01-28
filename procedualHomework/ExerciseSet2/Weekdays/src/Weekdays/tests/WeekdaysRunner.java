package Weekdays.tests;



import java.util.Locale;


public class WeekdaysRunner {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US", "en"));
		//System.out.printf("[WeekdaysRunner] calling Weekdays.Main.main: ");
		Weekdays.Main.main(args);

	}

}
