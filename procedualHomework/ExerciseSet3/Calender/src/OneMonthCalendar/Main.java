package OneMonthCalendar;


import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		int spaces, daysinmonth, dayofweek,i;

		Scanner sc = new Scanner(System.in);


		System.out.printf("Enter number of days in month: Enter starting day of the week (1=Monday, 7=Sunday): \n");
		daysinmonth= sc.nextInt();
		dayofweek= sc.nextInt();

		spaces= dayofweek;

		for(i = 0; i < spaces; i++)
			System.out.printf("   ");

		// For each day in the month...
		for(i = 1; i <= daysinmonth; i++)
		{
			// Print the date for the current day_of_week.
			// '%3d' will print the value padding with spaces if necessary such that
			// at least 3 characters are written.
			System.out.printf("%3d", i);

			// Increment the day_of_week.
			// The modulo operator '% 7' will cause day_of_week to wrap around to 0
			// when day_of_week reaches 7.
			dayofweek = (dayofweek + 1) % 7;

			// falls new day_of_week  0 waere, gib ein newline zum starten auf der naechste zeile
			if(dayofweek == 0)
				System.out.printf("\n");
		}
	}

}

//
//    for (int i = 0; i <= spaces; i++) {
//
//       System.out.printf(" ");
//
//       for ( i= 1; i<=(7-spaces); i++)
//          System.out.printf(" %d",i);
//       System.out.printf("\n");
//
//       if ((i-spaces) >10 && (i-spaces) < 14-spaces)
//          System.out.printf("   ");
//
//       for (i=(8-spaces); i<=(10-spaces); i++)
//          System.out.printf("  %d", i);
//       for (i=(11-spaces); i<=(14-spaces); i++)
//          System.out.printf(" %d", i);
//       System.out.printf("\n");
//
//
//       for(i=(15-spaces); i<=(21-spaces); i++)
//          System.out.printf(" %d", i);
//       System.out.printf("\n");
//
//       for(i=(22-spaces);i<=(28-spaces); i++)
//          System.out.printf(" %d", i);
//       System.out.printf("\n");
//
//       for(i=(29-spaces); i<=daysinmonth; i++)
//          System.out.printf(" %d", i);





//    0000000000000000System.out.print("Enter number of days in month: Enter starting day of the week");
//    Scanner sc = new Scanner(System.in);
//
//    System.out.printf("Hello OneMonthCalendar!");
//
//    sc.close();
