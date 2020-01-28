package Noten;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int entry = sc.nextInt();

		if (entry < 99 || entry > 999) {
			System.out.println("Noten: Erwarte genau 3 Noten!");
		}

		else {
			int firstNumber = extractFirstNumber(entry);
			int secondNumber = extractSecondNumber(entry);
			int thirdNumber = extractThirdNumber(entry);

//			check if all numbers are between 1 and 5

			if ( firstNumber>0 && firstNumber<6 && secondNumber>0 && secondNumber<6 && thirdNumber>0 && thirdNumber<6 ) {


				if ( firstNumber == 1 && secondNumber == 1 && thirdNumber== 1 ) {
					System.out.println("Noten: Ausgezeichneter Erfolg!");
				}

				else if (firstNumber == 5 || secondNumber == 5 || thirdNumber== 5) {
					System.out.println("Noten: Nicht bestanden!");
				}

				else if ((firstNumber == 1 && secondNumber == 1) || (thirdNumber == 1 && secondNumber == 1) || (thirdNumber == 1 && firstNumber == 1)  ) {
					if (firstNumber == 2 || secondNumber == 2 || thirdNumber== 2) {
						System.out.println("Noten: Guter Erfolg!");
					}
				}

				else {
					System.out.println("Noten: Bestanden.");
				}


			}

//			not all numbers between 1 and 5
			else {
				if (!(firstNumber>0 && firstNumber<6)) {
					System.out.println("Noten: Erste Note muss zwischen 1 und 5 liegen!");
				}

				else if (!(secondNumber>0 && secondNumber<6)) {
					System.out.println("Noten: Zweite Note muss zwischen 1 und 5 liegen!");
				}

				else if (!(thirdNumber>0 && thirdNumber<6)) {
					System.out.println("Noten: Dritte Note muss zwischen 1 und 5 liegen!");
				}

			}


//			System.out.println(thirdNumber);
		}

		sc.close();
	} //end of main method

	public static int extractFirstNumber(int param) {
		 param /= 100;
		 return param;
	}

	public static int extractSecondNumber(int param) {
		param %=100;
		param/= 10;
		return param;
	}

	public static int extractThirdNumber(int param) {
		param %=100;
		param %= 10;
		return param;
	}





}
