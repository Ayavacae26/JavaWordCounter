import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * By: Erik Ayavaca-Tirado
 * Iteration 1
 */

public class WordCount {
	public static void main(String[] args) {

		// Here we are setting up the scanner to take in a file
		Scanner textfile = new Scanner(System.in);

	    //File filename = new File("/Users/erikayavaca/Desktop/Erik Ayavaca.txt");
	
	try {
	    //Using the args(0) to put into the file into it
        File inputFile = new File(args[0]);

        //pointing to the file into the scanner
        textfile = new Scanner(inputFile);

        // Not nesscary for this a that momment
        //while(scan.hasNextLine()) {
		    //System.out.println(scan.nextLine());
		//}
	}
	catch(FileNotFoundException e) {
		System.out.println("File is not found");
        // e.printStackTrace();
	}



		HashMap<String, Integer> map = new HashMap<String, Integer>();
	}
}