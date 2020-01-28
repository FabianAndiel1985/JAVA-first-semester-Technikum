package LoopStatistics;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double min,max,userEntry;

		System.out.println("enter numbers:");
		userEntry = sc.nextDouble();

		max = userEntry;

		min = userEntry;

		double counter = 1;

		double sumOfEntries = userEntry;

		if(userEntry < 1) {
			System.out.println("no number entered.");
		}

		else {

			while(userEntry>0) {

				userEntry = sc.nextDouble();

				if(userEntry<1) {
					break;
				}

				counter += 1;

				sumOfEntries += userEntry;

				if (userEntry > max) {
					max = userEntry;
				}

				else if (userEntry<min) {
					min= userEntry;
				}

			}

			double mean = calculateMean(sumOfEntries,counter);



			System.out.printf("numbers entered: %.0f\n" + "minimum: %.2f\n"+"maximum: %.2f\n"+"mean:    %.2f\n",counter,min,max,mean);

		}

	} /* End of main method */

	/*calculate mean*/
	public static double calculateMean(double param1, double param2) {

		double mean = param1/param2;

		return mean;
	}

}
