package IntervalleSchliessen;


import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Grenze 1: ");
		int grenze1 = sc.nextInt();

		System.out.print("Grenze 2: ");
		int grenze2 = sc.nextInt();

		System.out.print("Grenze 1: ");
		int grenze3 = sc.nextInt();

		System.out.print("Grenze 2: ");
		int grenze4 = sc.nextInt();

		int firstNumClosedInter = 0;
		int fourthNumClosedInter = 0;

//		compare first 2
		if(grenze1 > grenze2) {
			int temp= grenze1;
			grenze1 = grenze2;
			grenze2 = temp;
		}

//		compare second 2
		if(grenze3 > grenze4) {
			int temp= grenze3;
			grenze3 = grenze4;
			grenze4 = temp;
		}

//		get first number

		if(grenze1 < grenze3) {
			firstNumClosedInter = grenze1;
		}

		else if(grenze1 > grenze3) {
			firstNumClosedInter = grenze3;
		}


//		get last number
		if(grenze2 > grenze4) {
			fourthNumClosedInter = grenze2;
		}
		else if (grenze2 < grenze4) {
			fourthNumClosedInter = grenze4;
		}

		else {
			firstNumClosedInter = grenze1;
			fourthNumClosedInter = grenze2;
		}





//		System.out.println(firstNumClosedInter +" ");
//
//		System.out.println(fourthNumClosedInter);

		System.out.printf("Intervall 1: [%d, %d]\n"+ "Intervall 2: [%d, %d]\n" + "geschlossenes Intervall: [%d, %d]",grenze1,grenze2,grenze3,grenze4,firstNumClosedInter,fourthNumClosedInter);

	}



	
}
