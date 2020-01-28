package Datum;


import java.util.Scanner;



public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int date = sc.nextInt();

		int day= date/1000000;

		int temp = date%1000000;

		int month = temp/10000;

		int year = temp%10000;

		boolean datumCorrect = false;

			while(!datumCorrect) {

				if (day < 1 || day > 31) {
					System.out.print("Datum: Tag muss zwischen 1 und 31 liegen!\n");
					break;
				}

				if (month < 1 || month > 12) {
					System.out.print("Datum: Monat muss zwischen 1 und 12 liegen!\n");
					break;
				}

				if(year < 1581 ) {
					System.out.print("Datum: Jahr muss groesser als 1581 sein!\n");
					break;
				}

				String monthString = changeMonth(month);

				datumCorrect = true;

				System.out.printf("Datum: %02d. %s %4d\n",day,monthString,year);
			}

	}



	public static String changeMonth(int param) {

		String[] months = {"Januar","Februar","Maerz","April","Mai","Juni","Juli","August","September","Oktober","November","Dezember"};

		String month=months[param-1];

		return month;

	}


}
