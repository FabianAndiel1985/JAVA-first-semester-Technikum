package Calendars;


import java.util.Arrays;
import java.util.Scanner;



public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();

//		dayNumber(year,month,day);

		weekNumber(year,month,day);

//		int check = checkDate(year,month,day);
//		System.out.println(check);
//
//		int dayNumb = ymd2w(year, month,day);
//
//		System.out.println(dayNumb);
//		printDayName(dayNumb);
//		printMonth(month);
//		sc.close();
	}

	public static int weekNumber(int year, int month, int day) {

		int numberOfDays = dayNumber(year,month,day);

		int weekNumber = numberOfDays/7;

		if(numberOfDays%7 != 0 && numberOfDays<364) {
			weekNumber += 1;
		}
		System.out.println(numberOfDays);
		System.out.println(weekNumber);

		return 1;

	}


	public static int dayNumber(int year, int month, int day) {

		int isLeapYear = isLeap(year);

		int daysSinceYearBeg = 0;

		int[] daysOfMonths = {31,28,31,30,31,30,31,31,30,31,30,31};

		if (isLeapYear == 1) {
			daysOfMonths[1] = 29;
		}

		if ( month != 1) {

			for (int i = 0; i < month - 1; i++) {
				daysSinceYearBeg += daysOfMonths[i];
			}
			daysSinceYearBeg = daysSinceYearBeg + day;
		}

		else {
			daysSinceYearBeg = day;
		}

//		System.out.println(daysSinceYearBeg);

		return daysSinceYearBeg;
	}



	public static void printMonth(int month) {

		if (month > 0 && month < 12) {
			String name = "";
			if (month == 1) {
				name = "January";
			} else if (month == 2) {
				name = "February";
			} else if (month == 3) {
				name = "March";
			} else if (month == 4) {
				name = "April";
			} else if (month == 5) {
				name = "May";
			} else if (month == 6) {
				name = "June";
			} else if (month == 7) {
				name = "July";
			} else if (month == 8) {
				name = "August";
			} else if (month == 9) {
				name = "September";
			} else if (month == 10) {
				name = "October";
			} else if (month == 11) {
				name = "November";
			} else if (month == 12) {
				name = "December";
			}
			System.out.print(name);
		}

		else {
			System.out.print("invalid day(<month>)");
		}
	}

	public static void printDayName(int day) {
		if (day >= 0 && day <= 6) {
			String name = "";
			if (day == 0) {
				name = "Sunday";
			} else if (day == 1) {
				name = "Monday";
			} else if (day == 2) {
				name = "Tuesday";
			} else if (day == 3) {
				name = "Wednesday";
			} else if (day == 4) {
				name = "Thursday";
			} else if (day == 5) {
				name = "Friday";
			} else {
				name = "Saturday";
			}

			System.out.print(name);

		}

		else {
			System.out.print("invalid day(<day>)");
		}
	}

	public static int ymd2w(int year, int month, int day) {
		if ( checkDate(year,month,day) == 1 ) {

			if (month == 1 || month == 2) {
				year -= 1;
				month += 10;
			}
			else {
				month -= 2;
			}

			int d = day;
			int m = month;
			int c = year / 100;
			int y = year % 100;

//			System.out.println(d);
//			System.out.println(m);
//			System.out.println(c);
//			System.out.println(y);

			double A = 0;

			A = d + (2.6 * m) - 0.2 + y + (y / 4) + (c / 4) - 2 * c;

			int temp = (int) A;
//			System.out.println(temp);

			int W = temp % 7;

//			System.out.println(W);

			if(W<0) {
				W = W +7;
			}
//			System.out.println(W);

			return W;
		}

		return -1;
	}

	public static int checkDate(int year, int month,int day) {
		if ( checkDate(year,month) == 1 ) {
			int maxDaysofMonth = daysInMonth(year,month);
			if (year == 1582 && day< 16) {
				return 0;
			}

			if( day > maxDaysofMonth || day < 1) {
				return 0;
			}

			return 1;
		}
		return 0;
	}


	public static int daysInMonth(int year, int month) {
		if( checkDate(year,month) == 1) {
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				return 31;
			}
			else if(month == 2) {
				if ( isLeap(year) == 1 ) {
					return 29;
				}
				return 28;
			}
			return 30;
		}
		return -1;
	}

	public static int checkDate(int year, int month) {
		if (checkDate1(year) == 1) {
			if ( month > 12 || month < 1 ) {
				return 0;
			}
			if ( year == 1582 && month < 10 ) {
				return 0;
			}
			return 1;
		}
		return 0;
	}


	public static int isLeap(int year) {
		if(checkDate1(year) == 1) {
			if (year%4 > 0) {
				return 0;
			}

			if (year%100 >0 ) {
				return 1;
			}

			if (year%400 > 0) {
				return 0;
			}
			return 1;
		}
		return -1;
	}

	public static int checkDate1(int year) {
		if ( year < 1582 || year > 2199 )  {
			return 0;
		}
		return 1;
	}


}
