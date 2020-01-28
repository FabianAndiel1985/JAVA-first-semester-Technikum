package NeighborOfTheBeast;




public class Main {

	
	public static void main(String[] args) {

		int number = 667;
		System.out.println("the neighbor of the beast:"+String.format("%4d",number)+"!\n" +
				"the neighbor of the beast:"+String.format("%4X",number)+"!\n" +
				"the neighbor of the beast:"+String.format("%11d",number)+"!\n" +
				"the neighbor of the beast:"+String.format("% -11d",number)+"!\n" +
				"the neighbor of the beast:"+String.format("% 09d",number)+"!\n" +
				"the neighbor of the beast:"+String.format(" %-+12d",number)+"!");

	}


}
