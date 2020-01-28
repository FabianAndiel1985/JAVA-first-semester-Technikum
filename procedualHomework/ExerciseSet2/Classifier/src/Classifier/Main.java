package Classifier;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		 System.out.println("Hello world!");
		Scanner sc = new Scanner(System.in);

		System.out.print("enter price: ");
		int price = sc.nextInt();

		System.out.print("enter quality: ");
		int quality = sc.nextInt();

		String priceDescri = "";
		String qualityDescri = "";


		if (price > 49) {
			System.out.println("high price");
			priceDescri = "high";
		}

		else if (price < 50 ) {
			System.out.println("low price");
			priceDescri = "low";
		}

		if (quality > 49) {
			System.out.println("high quality");
			qualityDescri = "high";
		}

		else if (quality < 50 ) {
			System.out.println("low quality");
			qualityDescri = "low";
		}

		if ( qualityDescri == "low" ) {
			if (priceDescri == "low") {
				System.out.println("junk");
			}
			else if ( priceDescri == "high") {
				System.out.println("rip off");
			}
		}

		else if ( qualityDescri == "high" ) {
			if (priceDescri == "low") {
				System.out.println("bargain");
			}
			else if ( priceDescri == "high") {
				System.out.println("luxury");
			}
		}

	}


}
