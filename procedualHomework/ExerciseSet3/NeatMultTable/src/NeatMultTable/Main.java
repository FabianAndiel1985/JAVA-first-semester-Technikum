package NeatMultTable;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);

		System.out.print("enter rows: ");
		int rows = sc.nextInt();

		System.out.println("enter columns: ");
		int columns = sc.nextInt();

		String firstLine="";
		String secondLine= "-------";

//		display colummns

		for(int i=1;i<columns+1;i++) {
			firstLine += "  " + i;
			if ( columns>1 && i< columns ) {
				secondLine += "---";
			}
		}

//		System.out.println(firstLine);

		System.out.printf("    %s\n"+"%s\n",firstLine,secondLine);

		for (int i=1;i<rows+1;i++) {

			System.out.print(" "+i+" |");
			for (int j=1;j<columns+1;j++) {
				System.out.printf("%3d",i*j);
			}
			if(i != rows) {
				System.out.print("\n");
			}

		} //end display table body

	}


}
