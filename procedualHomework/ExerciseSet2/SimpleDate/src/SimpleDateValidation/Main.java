package SimpleDateValidation;


import java.util.Scanner;



public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //how to get a scanner 

		System.out.print("Tag: ");
		int day = sc.nextInt();
		System.out.print("Monat: ");
		int month = sc.nextInt();
		System.out.print("Jahr: ");
		int year = sc.nextInt();

		System.out.printf("Datum: %02d.%02d.%d\n\n",day,month,year);

		boolean dateValidation = true;

		if(day<1 || day>31) {
			System.out.println("Tag ist nicht im Bereich!");
			dateValidation = false;
		}

		if(month<1 || month>12) {
			System.out.println("Monat ist nicht im Bereich!");
			dateValidation = false;
		}
		if(year<1 || year>9999) {
			System.out.println("Jahr ist nicht im Bereich!");
			dateValidation = false;
		}

//		when everythin is valid regarding the number range
		if(dateValidation) {
				if( (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)&&(day>31) ) {
					System.out.println("Datum ist falsch!");
				}

				else if( (month==4 || month==6 || month==9 || month==11)&&(day> 30) ) {
				System.out.println("Datum ist falsch!");
				}

				else if( (month== 2)&&(day> 28) ) {
					System.out.println("Datum ist falsch!");
				}

				else {
					System.out.println("Datum ist richtig!");
				}
//			System.out.println("Datum ist richtig!");
		}

		
		sc.close();
	}
}
