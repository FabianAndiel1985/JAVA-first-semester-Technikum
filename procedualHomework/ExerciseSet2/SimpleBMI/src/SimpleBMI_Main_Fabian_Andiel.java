package SimpleBMI;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double kg = sc.nextDouble();

		double groesse = sc.nextDouble();

		double bmi = kg / (groesse * groesse);
		int kategorie=0;
		String kategorieBezeichnung = "";

		if(kg > 39.99 && groesse > 1.59) {
			if ( bmi >= 40  ) {
				kategorie=42;
				kategorieBezeichnung="adipoes Grad III";
			}

			else if (  bmi <= 39.99 && bmi >= 35  ) {
				kategorie=41;
				kategorieBezeichnung="adipoes Grad II";
			}

			else if (  bmi <= 34.99 && bmi >= 30  ) {
				kategorie=40;
				kategorieBezeichnung="adipoes Grad I";
			}

			else if ( bmi <= 29.99 && bmi >= 25 ) {
				kategorie=30;
				kategorieBezeichnung="praeadipoes";
			}

			else if ( bmi <= 24.99 && bmi >= 18.50 ) {
				kategorie=20;
				kategorieBezeichnung="normalgewichtig";
			}

			else if ( bmi <= 18.49 && bmi >= 17 ) {
				kategorie=12;
				kategorieBezeichnung="leicht untergewichtig";
			}

			else if ( bmi <= 16.99 && bmi >= 16 ) {
				kategorie=11;
				kategorieBezeichnung="maessig untergewichtig";
			}

			else if(bmi < 16) {
				kategorie=10;
				kategorieBezeichnung="stark untergewichtig";
			}

			System.out.printf("Koerpergewicht [kg]: Koerpergroesse [m]: m=%.2fkg l=%.2fm -> BMI=%.2f (Kategorie %d \""+kategorieBezeichnung+"\")\n", kg, groesse,bmi,kategorie,kategorieBezeichnung);
		}

		else {
			kategorie=-1;
			kategorieBezeichnung="ungueltig";
			bmi= -1;

			System.out.printf("Koerpergewicht [kg]: Koerpergroesse [m]: m=%.2fkg l=%.2fm -> BMI=%+.2f (Kategorie %+d \""+kategorieBezeichnung+"\")\n", kg, groesse,bmi,kategorie,kategorieBezeichnung);
		}




		sc.close();
	}
}
