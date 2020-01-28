package DateFormatConverter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int unserEntry = sc.nextInt();

		changeEntry(unserEntry);

	}

	public static void changeEntry(int param) {

		if (param > 15821015 && param < 21001232 ) {
			int year = param / 10000;

			int temp = param % 10000;

			int preMonth = temp / 100;

			String month = String.format("%02d", preMonth);

			int preDay = temp % 100;

			String day = String.format("%02d", preDay);

			System.out.printf("enter date (yyyymmdd)\n%s.%s.%s\n", day, month, year);
		}

		else {
			System.out.printf("enter date (yyyymmdd)\ninvalid date\n");
		}

	}

}
