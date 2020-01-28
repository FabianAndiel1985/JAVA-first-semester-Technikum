package TimeIntervall;


import java.util.Scanner;



public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		System.out.printf("Hello TimeIntervall!");

		System.out.print("Enter start time: ");
		int time1 = sc.nextInt();

		System.out.print("Enter end time: ");
		int time2=sc.nextInt();



		if ((time1>time2) ) {
			System.out.print("Time interval: NOT VALID");
		}

		else if (time1 > 2359 || time1 < 0 || time2 > 2359 || time2 < 0 || time1%100 > 59 || time2%100 > 59 ) {
			System.out.print("Time format error.");
		}


		else {
			int time1InMinutes = changeInMinutes(time1);
			int time2InMinutes = changeInMinutes(time2);

			int timeDifference =time2InMinutes - time1InMinutes;

			String time = changeInHours(timeDifference);

			System.out.printf("Time interval:  %s",time);
		}

		sc.close();
	}

	public static String changeInHours(int param) {
		int hours = param/60;
		int minutes = param%60;
		String time = String.format("%d:%d",hours,minutes);
		return time;
	}

	public static int changeInMinutes(int param) {
		int getHours = param/100;
		int getMinutes = param%100;

		int hoursChangedToMinutes = getHours*60;

		return hoursChangedToMinutes+getMinutes;
	}

}
