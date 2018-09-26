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
		Scanner textFile = new Scanner(System.in);

	    //File filename = new File("/Users/erikayavaca/Desktop/Erik Ayavaca.txt"); Orginal input idea
	
	try {
	    //Using the args(0) to put into the file into it
        File inputFile = new File(args[0]);

        //pointing to the file into the scanner
        textFile = new Scanner(inputFile);

        // Not nesscary for this a that momment
        //while(scan.hasNextLine()) {
		    //System.out.println(scan.nextLine());
		//}
	}
	catch(FileNotFoundException e) {
		System.out.println("File is not found");
        // e.printStackTrace();
	}
		// going to use hashmap to keep track of the words
		HashMap<String, Integer> wordCounter= new HashMap<String, Integer>();

		while(textFile.hasNext() !=false){
			/*
			Storing the next scanned text into a new variable
			 */
			String text = textFile.next();

			//Punctation clean uo. transform into lowercase and elminate punctuations
			text = text.toLowerCase();
			
		}
	}
}