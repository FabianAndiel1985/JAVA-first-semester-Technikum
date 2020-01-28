package TimeFormatConverter;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //how to get a scanner 

		System.out.print("Zeit: ");

		int time = sc.nextInt();

		int hours = time/100;
		int minutes = time%100;

		boolean timeValid = validateNumber(hours,minutes);

//		when time entry is valid
		if (timeValid) {
			String category = "";

			if (time >= 0 && time <= 1159) {

				category = "AM";

				if( hours == 0) {
					hours=12;
				}
			}

			else if (time >= 1200 && time <= 2359) {
				category = "PM";

				if ( hours>=13 && hours <= 23) {
					hours -= 12;
				}
			}
			System.out.printf("%02d:%02d %s\n",hours,minutes,category);
		}

//		end when time is valid



		sc.close();
	}

	public static boolean validateNumber(int param1, int param2) {

		if (param1>23 || param2>59 || param1<0 || param2<0   ) {
			System.out.println("Ungueltige Eingabe!");
			return false;
		}
		return true;
	}
}
