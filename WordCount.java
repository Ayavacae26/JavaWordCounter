import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;


public class WordCount {
	public static void main(String[] args) {

		// Here we are setting up the scanner to take in a file
		Scanner scan = new Scanner(System.in);

	File filename = new File("/Users/erikayavaca/Desktop/Erik Ayavaca.txt");
	
	try {
		scan = new Scanner(filename);
		while(scan.hasNextLine()) {
	
			System.out.println(scan.nextLine());
		}
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
		
	}



		HashMap<String, Integer> map = new HashMap<String, Integer>();
	}
}