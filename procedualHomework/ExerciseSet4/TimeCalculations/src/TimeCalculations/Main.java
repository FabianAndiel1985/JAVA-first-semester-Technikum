package TimeCalculations;


import java.util.Scanner;


public class Main {

		/* D O N T T O U C H T H I S */

	private interface Test {
		void test();
	}

	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		/* Input */
		int num;
		/* List of all available tests */
		Test[] tests = { new Test() {

			@Override
			public void test() {
				int h, m;
				System.out.printf("h: ");
				h = sc.nextInt();
				System.out.printf("m: ");
				m = sc.nextInt();
				System.out.printf("encoded: %04d", encode(h, m));

			}
		}, new Test() {

			@Override
			public void test() {
				System.out.printf("read: %04d", read());

			}
		}, new Test() {

			@Override
			public void test() {
				int t;
				System.out.printf("hours: %02d\n", hours(t = read()));
				System.out.printf("minutes: %02d\n", minutes(t));

			}
		}, new Test() {

			@Override
			public void test() {
				print(read());

			}
		}, new Test() {

			public void test() {
				int t1 = read();
				int t2 = read();
				System.out.printf("add: ");
				print(t1);
				System.out.printf(" + ");
				print(t2);
				System.out.printf(" = ");
				print(add(t1, t2));
			}
		}, new Test() {

			@Override
			public void test() {
				int t = read();
				System.out.printf("read: %d\n", total_minutes(t));

			}
		}

		};

		int num_of_tests = tests.length;

		/* Read test number */
		System.out.printf("Test #: ");
		num = sc.nextInt();

		/* Check valid range */
		if (num >= 1 && num <= num_of_tests) {
			/* Call the selected test */
			System.out.printf("Executing Test_%d.\n", num);
			tests[num - 1].test();
		} else {
			/* Print error */
			System.out.printf("Invalid test number!");
		}

		sc.close();
	}


	public static int encode(int h, int m) {
//		String message = String.format("%2d%2d",h,m);
		int encodedTime= (h*100) +m;
		return encodedTime;
	}

	public static int read() {
		System.out.print("hours: ");
		int h = sc.nextInt();

		System.out.print("minutes: ");
		int m = sc.nextInt();

		int encodedTime= (h*100) +m;

		return encodedTime;
	}

	public static int hours(int t) {
		int hours = t/100;
		return hours;
	}

	public static int minutes(int t) {
		int minutes = t%100;
		return minutes;
	}

	public static void print(int t) {
		int hours = hours(t);
		int minutes = minutes(t);
		System.out.printf("%02d:%02d",hours,minutes);
	}

	public static int add(int t1, int t2) {
		int hourst1 = hours(t1);
		int minutest1 = minutes(t1);

		int hourst2 = hours(t2);
		int minutest2 = minutes(t2);

		int increaseHours = 0;
		int increaseMinutes = 0;

		int sumMinutes= minutest1 + minutest2;

		if (sumMinutes > 59) {

			hourst2 += sumMinutes/60;
			sumMinutes = sumMinutes%60;
		}

		int sumHours= hourst1+hourst2;

		if(sumHours > 23) {
			sumHours -= 24;
		}

		//show the calculated time

		int totalTime = sumHours*100 + sumMinutes;

		return totalTime;

	}

	public static int total_minutes(int t) {
		int hours = hours(t);
		int minutes = minutes(t);

		int hoursChangedInMinutes = hours*60;
		int totalTime = hoursChangedInMinutes + minutes;

		return totalTime;

	}









}
