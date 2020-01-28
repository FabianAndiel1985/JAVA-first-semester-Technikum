package Rhombus;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		double e = sc.nextDouble();

		System.out.printf("a: b: c: d: e: \n" +
				"012345678901234567890123\n" +
				"\n" +
				"%-7d    /\\    %7d\n" +
				"          /  \\\n" +
				"         /    \\\n" +
				"        | %+.1f |\n" +
				"         \\    /\n" +
				"          \\  /\n" +
				"%-7d    \\/    %7d\n",a,b,e,c,d);

	}

}
