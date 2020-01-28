package Classifier.tests;



import java.util.Locale;


public class ClassifierRunner {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US", "en"));
		//System.out.printf("[ClassifierRunner] calling Classifier.Main.main: ");
		Classifier.Main.main(args);

	}

}
