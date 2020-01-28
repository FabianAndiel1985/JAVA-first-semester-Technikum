package Steakhouse;


import java.util.Scanner;



public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Steak type: ");
		int steakType = sc.nextInt();
		String steak= "";

		System.out.print("Cooking degree: ");
		int cookingDegree = sc.nextInt();
		String cooking= "";

		System.out.print("Side order: ");
		int sideOrder = sc.nextInt();
		String side= "";

		String potatoe= "";

		String topping = "";


//		check steak type

		if(steakType == 1) {
			steak ="T-bone";
		}

		else if(steakType == 2) {
			steak ="Sirloin";
		}

		else if(steakType == 3) {
			steak ="Rib eye";
		}

		//		check cooking degree

		if(cookingDegree  == 1) {
			cooking ="rare";
		}

		else if(cookingDegree  == 2) {
			cooking ="medium rare";
		}

		else if(cookingDegree  == 3) {
			cooking ="medium";
		}

		else if(cookingDegree  == 4) {
			cooking ="medium well done";
		}

		else if(cookingDegree  == 5) {
			cooking ="well done";
		}

//		Side order

		if(sideOrder == 1) {
			side ="Bread";
		}

		else if(sideOrder  == 2) {
			side ="Potatoes";
		}

//		potatoe types

		if(sideOrder == 1) {
			side ="Bread";
		}

		else if(sideOrder  == 2) {
			side ="Potatoes";
		}


//		print if bread is choosen
		if (sideOrder == 1) {
			System.out.print("\n"+steak +", "+cooking+", "+side);
		}

//		if potatoes are choosen
		else {
			System.out.print("Potatoe type: ");
			int potatoeType = sc.nextInt();

//			potatoe type without special topping choosen
			if (potatoeType == 1 || potatoeType == 2 ) {
				if (potatoeType == 1) {
					potatoe = "French fries";
				}
				else  {
					potatoe = "Wedges";
				}
				System.out.print("\n"+steak +", "+cooking+", "+potatoe);
			}

//			potatoe type with special dressing
			else {
				potatoe = "Baked potatoes";
				System.out.print("Potatoe topping: ");
				int toppingType = sc.nextInt();

					if(toppingType == 1) {
						topping = "Garlic topping";
					}

					else if(toppingType == 2) {
						topping = "French dressing";
					}

					else if(toppingType == 3) {
						topping = "Buttered";
					}
				System.out.print("\n"+steak +", "+cooking+", "+potatoe+", "+topping);
			}



		}
//end choosing of potatoes



		
		sc.close();
	}
}
