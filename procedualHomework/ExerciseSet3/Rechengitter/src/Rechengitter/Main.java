package Rechengitter;


import java.util.Scanner;



public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Anzahl Spalten: ");
		int columns = sc.nextInt();

		System.out.print("Anzahl Zeilen:   ");
		int rows = sc.nextInt();

		String firstLine = "";

//		display heading

		for ( int i=1;i<columns+1;i++) {
			if (i == 1) {
				firstLine += i;
			}
			else {
				firstLine += "   " + i;
			}
		}

		System.out.print("+ |  " + firstLine +" \n"+"-------------------------\n");


//		display body

		for ( int i=1;i<rows+1;i++ ) {
			System.out.print("   "+i+"| ");
			for( int j=1;j<columns+1;j++) {
				if(j == 1) {
					System.out.printf("%2d",i+j);
				}

				else if ( j > 1 && j < columns+1) {
					System.out.printf("%4d",i+j);
					if(j== columns) {
						System.out.printf(" \n");
					}
				}



			}
		}

		
		sc.close();
	}
}
