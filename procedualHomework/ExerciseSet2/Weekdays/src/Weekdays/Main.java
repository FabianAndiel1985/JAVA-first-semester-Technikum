package Weekdays;


import java.util.Scanner;



public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("yyyymmdd: ");
		int date= sc.nextInt();

		boolean dateValid = validateDate(date);

		if (!dateValid) {
			System.out.println("not valid.");
		}

		sc.close();
	}

//	EXTRA FUNKTIONEN_________________________________________________________________
	public static boolean validateDate(int param) {
		boolean dateValid = true;

		int year = param/10000;

		int temp= param%10000;

		int month= temp/100;

		int day= temp%100;

//		Schaltjahr

		if((day>0 && day<32)&&(month>0 && month<13)) {

			if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 8 ||month == 12)&& day<32) {
				dateValid=true;
			}

			else if((month == 4 || month == 6 || month == 9 || month == 11)&& day<31) {
				dateValid=true;
			}

//			Schaltjahr check
			else if (month ==2) {
				if (year%4 == 0) {
					if (month == 2 && day > 29) {
						dateValid = false;
					} else {
						dateValid = true;
					}

				} else {
					if (month == 2 && day > 28) {
						dateValid = false;
					} else {
						dateValid = true;
					}
				}
			}
//			Ende Schaltjahr Check
			else {
				dateValid=false;
			}
		}


//		if((day>0 && day<32)&&(month>0 && month<13)) {
//			if(month == 2 &&(day>0 && day<29)) {
//				dateValid = true;
//			}
//			else {
//				dateValid = false;
//			}
//		}
		else {
			dateValid = false;
		}
		return dateValid;
	}
	/*end date validation */

}
