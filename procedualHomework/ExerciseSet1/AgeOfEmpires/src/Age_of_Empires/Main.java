package Age_of_Empires;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		 //System.out.println("Hello Age_of_Empires!");
		Scanner sc = new Scanner(System.in);
		int userEntry = sc.nextInt();

		int test = userEntry;

		int test1 = test;

		int test2 = test;
		int test3 = test;
		int test4 = test;
		int test5 = test;
		int test6 = test;

		if ( userEntry == 0) {
			System.out.printf("Your age: %%d:   ~%d~\n" +
					"%%+d:  ~%+d~\n" +
					"%% d:  ~%2d~\n" +
					"%%5d:  ~%5d~\n" +
					"%%05d: ~%05d~\n" +
					"%%-5d: ~%-5d~\n" +
					"%%#x:  ~%#x~\n",test,test1,test2,test4,test5,test6,test);
		}

		else {
			System.out.printf("Your age: %%d:   ~%d~\n" +
					"%%+d:  ~%+d~\n" +
					"%% d:  ~%3d~\n" +
					"%%5d:  ~%5d~\n" +
					"%%05d: ~%05d~\n" +
					"%%-5d: ~%-5d~\n" +
					"%%#x:  ~%#x~\n",test,test1,test2,test4,test5,test6,test);

		}
	}
}
