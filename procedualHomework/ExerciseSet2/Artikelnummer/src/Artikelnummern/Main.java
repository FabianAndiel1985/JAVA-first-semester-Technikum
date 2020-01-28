package Artikelnummern;


import java.util.Scanner;



public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean invalidEntry = true;

			System.out.print(": ");
			int entry1 = sc.nextInt();
			int entry2= 0;
			int entry3= 0;

			if( 1 <= entry1 && entry1 <= 3 ) {
				System.out.print(": ");
				entry2 = sc.nextInt();

				// First subgroup level

				if (entry1 == 1) {
					if (entry2 == 1 || entry2 == 2 || entry2 == 3) {
						System.out.print(": ");
						entry3 = sc.nextInt();
						if (1 <= entry3 && entry3 <= 4) {
							invalidEntry = false;
						}
						else {
							System.out.println("Falsche Eingabe");
						}
					}
					else {
						System.out.println("Falsche Eingabe");
					}
				}

				else if (entry1 == 2) {
					if (entry2 == 1 || entry2 == 2 || entry2 == 9) {
						System.out.print(": ");
						entry3 = sc.nextInt();
						if (1 <= entry3 && entry3 <= 4) {
							invalidEntry = false;
						}
					} else {
						System.out.println("Falsche Eingabe");
					}
				}

				else {

					if (entry2 == 1) {
						System.out.print(": ");
						entry3 = sc.nextInt();

						if (entry3 == 1) {
							invalidEntry = false;
						}

						else {
							System.out.println("Falsche Eingabe");
						}
					}

					else {
						System.out.println("Falsche Eingabe");
					}
				}

			}

			else {
				System.out.println("Falsche Eingabe");
			}
//				else if (entry1 == 2) {
//					entry3 = sc.nextInt();
//					if (entry2 == 1 || entry2 == 2 || entry2 == 9) {
//						if ( 1 <= entry3 && entry3 <= 2 ) {
//							validEntry = true;
//						}
//					}
//				}
//				else {
//					entry3 = sc.nextInt();
//					if (entry2 == 1) {
//						if ( entry3 == 1 ) {
//							validEntry = true;
//						}
//
//					}
//				}

//			}



//			System.out.print(": ");
//			int entry3 = sc.nextInt();



		String product="";


	if(!invalidEntry) {


//		WHEN EVERYTHING WORKS__________________________________________________________________
//		article groups

//		main group 1_______________________________________________________
		if (entry1 == 1) {
//			subgroups 1
			if (entry2 == 1) {
//				article 1
				if (entry3 == 1) {
					product = "Bier (hell, 0,5)";
				}
//				article 2
				else if (entry3 == 2) {
					product = "Bier (hell, 0,33)";
				}
//				article 3
				else if (entry3 == 3) {
					product = "Zwickel (0,5)";
				}
//				article 4
				else if (entry3 == 4) {
					product = "Zwickel (0,33)";
				}
			}
//			subgroups 2
			else if (entry2 == 2) {
//				article 1
				if (entry3 == 1) {
					product = "Cola";
				}
//				article 2
				else if (entry3 == 2) {
					product = "Fanta";
				}
			}
//			subgroups 3
			else if (entry2 == 3) {
//				article 1
				if (entry3 == 1) {
					product = "Rotwein";
				}
//				article 2
				else if (entry3 == 2) {
					product = "Wei�er Spritzer";
				}
			}
		}
//		end of main group 1____________________________________________________

//		main group 2_______________________________________________________________
		else if (entry1 == 2) {
//			subgroups 1
			if (entry2 == 1) {
//				article 1
				if (entry3 == 1) {
					product = "Schnitzel";
				}
//				article 2
				else if (entry3 == 2) {
					product = "Schweinsbraten";
				}
			}
//			subgroups 2
			else if (entry2 == 2) {
//				article 1
				if (entry3 == 1) {
					product = "Frankfurter";
				}
			}
//			subgroups 9
			else if (entry2 == 9) {
				if (entry3 == 1) {
					product = "Ketchup";
				}
			}
		}
//		end of main group 2____________________________________________________

//		main group 3_______________________________________________________________
		else if (entry1 == 3) {
//			subgroups 1
			if (entry2 == 1) {
				product = "Zigaretten";
			}
		}
//		end of main group 3____________________________________________________

		System.out.println(product);
	}



		
		sc.close();
	}
}
