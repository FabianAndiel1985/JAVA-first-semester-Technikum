package MalReihe;



import java.util.Scanner;



public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int fixfaktor=-20;
		int grenzfaktor=-20;

		while (fixfaktor<-10 || fixfaktor == 0 || fixfaktor>10) {
			System.out.print("Fixfaktor: ");
			fixfaktor = sc.nextInt();
		}

		while (grenzfaktor<1 || grenzfaktor>10) {
			System.out.print("Grenzfaktor: ");
			grenzfaktor = sc.nextInt();
		}

		for(int i=1; i<grenzfaktor+1;i++) {
			System.out.printf("%2d x  %2d =  %3d\n",i,fixfaktor,i*fixfaktor);
		}



		
		sc.close();
	}
}
