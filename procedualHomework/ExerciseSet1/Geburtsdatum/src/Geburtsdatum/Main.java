package Geburtsdatum;


import javax.print.DocFlavor;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //how to get a scanner

		int date = sc.nextInt();

		extractParts(date);

		sc.close();
	}

	//__________________________________________________

	public static int convertDecimalToOctal(int param) {
		int octalNumber = 0, i = 1;
		while (param != 0) {
			octalNumber += (param % 8) * i;
			param /= 8;
			i *= 10;
		}
		return octalNumber;
	}
	//__________________________________________________

	public static void extractParts(int param) {
		int preDay = param / 10000;
		String day = String.format("%02d", preDay);

		int temp = param % 10000;

		int preMonth = temp / 100;
		String month = String.format("%02d", preMonth);

		int preYear = temp % 100;
		String year = String.format("%02d", preYear);

		System.out.printf("Geburtsdatum: Ausgabe: %s%s%s\n", year, month, day);
	}
}


