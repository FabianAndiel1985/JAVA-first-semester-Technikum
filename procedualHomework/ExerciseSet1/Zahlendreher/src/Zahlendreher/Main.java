package Zahlendreher;


import java.io.PrintStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int userEntry = sc.nextInt();
		sortNumber(userEntry);

	} // end main method

	public static void sortNumber( int number) {
			String result;

			if ( number > 99) {

				// third number

				int number3 = number/100;

				// first and second number

				int temp = number%100;

				int number2 = temp/10;

				int number1 = temp%10;

				result= String.format("%d%d%d",number1,number2,number3);

				System.out.println("Zahl: " + "Ausgabe: "+ result);
			}

			else if (number < 100 && number > 9) {

				int number2 = number/10;

				int number1 = number%10;

				result= String.format("%d%d",number1,number2);
				String result2d = String.format("%-3s",result).replace(' ', '0');

				System.out.println("Zahl: " + "Ausgabe: "+ result2d);
			}

			else if (number < 10) {

				String result1d = String.format("%-3s",number).replace(' ', '0');

				System.out.println("Zahl: " + "Ausgabe: "+ result1d);
			}


	}

}


