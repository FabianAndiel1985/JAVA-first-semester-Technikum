package Zeit;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int userEntry = sc.nextInt();

		int hours = userEntry / 100;

		int minutes = userEntry % 100;

		boolean timeCorrect = false;

		int numberArray1[] = {1,2,3,4,5,6,7,8,9,10,11,0};
		int numberArray2[] = {13,14,15,16,17,18,19,20,21,22,23,12};
		String numberArrayString[] = {"Ein","Zwei","Drei","Vier","Fuenf","Sechs","Sieben","Acht","Neun","Zehn","Elf","Zwoelf"};
		int index = 0;
		String time = "";

		while (!timeCorrect) {
			if (userEntry == 1200) {
				System.out.print("Zeit: Zwoelf Uhr mittags");
				break;
			}

			else if (userEntry == 0000) {
				System.out.print("Zeit: Mitternacht\n");
				break;
			}

			else if (hours > 23 || hours < 0) {
				System.out.print("Zeit: Stunden muessen zwischen 0 und 23 sein!\n");
				if (minutes > 59 || minutes < 0) {
					System.out.print("Minuten muessen zwischen 0 und 59 sein!\n");
				}
				break;
			}

			else if (minutes > 59 || minutes < 0) {
				System.out.print("Zeit: Minuten muessen zwischen 0 und 59 sein!\n");
				break;
			}

			//everythin ran correct _______________________________________________________________

			else if (hours > -1 && hours < 12) {
				index =checkHours(numberArray1,hours);
				time = "vormittags";
			}

			else if (hours > 11 && hours < 24) {
				index = checkHours(numberArray2, hours);
				time = "nachmittags";
			}

			String hourString = numberArrayString[index];


				if(minutes==0) {
					System.out.printf("Zeit: %s Uhr (%s)\n",hourString,time);
				}

				else {
					System.out.printf("Zeit: %s Uhr %d (%s)\n", hourString, minutes, time);
				}
			timeCorrect = true;
		}
	}

	public static int checkHours (int[] array, int param) {
		int alternative = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == param) {
				return i;
			}
		}
		return alternative;
	}

}
