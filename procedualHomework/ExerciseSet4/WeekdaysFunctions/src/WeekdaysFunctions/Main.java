package WeekdaysFunctions;


import java.util.Scanner;

public class Main {
	

	
	public static void main(String[] args) {
		System.out.print("enter date (yyyymmdd): ");
		Scanner sc = new Scanner(System.in);
		int date = sc.nextInt();
		
		int inDay = date % 100, inMonth = date % 10000 / 100, inYear = date / 10000;
		
		if(validate(inYear, inMonth, inDay)){
			int W = weekday(inDay, inMonth, inYear);
			String weekday = dayName(W);
			
			System.out.printf("%s",  weekday);
			
		}else {
			System.out.printf("invalid date (%d)\n", date);
		}
	}

//	______________________________

    public static String dayName(int W) {
	    if(W==0) {
	        return "Sunday";
        }

	    else if(W==1) {
	        return "Monday";
        }
        else if(W==2) {
            return "Tuesday";
        }
        else if(W==3) {
            return "Wednesday";
        }
         else if(W==4) {
            return "Thursday";
        }
        else if(W==5) {
            return "Friday";
        }

        return "Saturday";
    }

    public static int weekday(int inDay, int inMonth, int inYear){
        if(inMonth == 1 || inMonth == 2){
            inYear -= 1;
            inMonth += 10;
        }

        else if (!(inMonth == 1 || inMonth == 2)) {
            inMonth -=2;
        }

        int d = inDay;
        int m = inMonth;
        int c = inYear/100;
        int y = inYear%100;

        double A = 0;

        A = d + Math.floor(2.6*m - 0.2) + y + Math.floor(y/4) + Math.floor(c/4) - 2*c;

        // oder Math Floor

        int temp= (int)A;

        int W = temp%7;

        while( W < 0) {
            W = W +7;
        }
        return W;
    }


    public static boolean validate(int year, int month,int day) {
        if ( validate(year,month) ) {
            int maxDaysofMonth = nDays(month,year);

            if (year == 1582 && day< 16) {
                return false;
            }

            if( day > maxDaysofMonth || day < 1) {
                return false;
            }
            return true;
        }
        return false;
    }


    public static int nDays(int month, int year) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        }
        else if(month == 2) {
            if ( isLeap(year) ) {
                return 29;
            }
            return 28;
        }
        return 30;
    }

    public static boolean validate(int year) {
        if ( year < 1582 || year > 2199 )  {
            return false;
        }
        return true;
    }

    public static boolean validate(int year, int month) {
        if (validate(year)) {
            if ( month > 12 || month < 1 ) {
                return false;
            }
            if ( year == 1582 && month < 10 ) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean isLeap(int year) {
        if (year%4 > 0) {
            return false;
        }

        if (year%100 >0 ) {
            return true;
        }

        if (year%400 > 0) {
            return false;
        }

        return true;
    }


//________________________





//	public static boolean validate(int year, int month,int day) {
//		return true;
//	}

//	public static int weekday(int inDay, int inMonth, int inYear) {
//		return 7;
//	}

//	public static String dayName(int W) {
//		return "Hallo";
//	}








}
