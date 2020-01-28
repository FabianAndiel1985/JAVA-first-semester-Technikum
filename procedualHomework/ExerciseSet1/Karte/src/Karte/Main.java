package Karte;


import java.util.Scanner;



public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		int test = number;
		int test2 = test;
		int test3 = test;
		int test4 = test;



		System.out.printf("Eingabe: ---------------\n" +
				"| %-5d %5d |\n" +
				"| \\         / |\n" +
				"|  \\       /  |\n" +
				"|   \\     /   |\n" +
				"|    \\   /    |\n" +
				"|     \\ /     |\n" +
				"|      X      |\n" +
				"|     / \\     |\n" +
				"|    /   \\    |\n" +
				"|   /     \\   |\n" +
				"|  /       \\  |\n" +
				"| /         \\ |\n" +
				"| %-+5d %+5d |\n" +
				"---------------\n",test,test2,test3,test4);
		
		sc.close();
	}
}
