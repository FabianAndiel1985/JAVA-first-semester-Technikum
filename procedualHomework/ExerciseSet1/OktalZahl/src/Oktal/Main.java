package Oktal;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int userEntry = sc.nextInt();

		int decimalValue = 0;
		int i = 0;

		//Oktalwert berechnen

		while(userEntry != 0)
		{
			decimalValue += (userEntry % 10) * Math.pow(8, i);
			++i;
			userEntry/=10;
		}

		// Ziffernsumme berechnen

		int firstDigit = decimalValue/100;

		int temp = decimalValue%100;

		int secondDigit = temp/10;

		int thirdDigit = temp%10;

		//System.out.println(firstDigit + " " + secondDigit + " " + thirdDigit);

		int numberSum = firstDigit + secondDigit + thirdDigit;

//		System.out.println(decimalValue);

		System.out.println("Oktalzahl eingeben: dezimal: " + decimalValue +"\n" + "Ziffernsumme: " + numberSum);

		sc.close();
	}

}


