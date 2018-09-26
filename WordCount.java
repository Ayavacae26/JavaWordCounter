import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * By: Erik Ayavaca-Tirado
 * Iteration 1
 * As of 9/26//18 - output is not ordered
 */

public class WordCount {
    public static void main(String[] args) {

        // Here we are setting up the scanner to take in a file
        Scanner textFile = new Scanner(System.in);

        //File filename = new File("/Users/erikayavaca/Desktop/Erik Ayavaca.txt"); Orginal input idea

        //
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
        // Will output if inout file is not found.
        catch (FileNotFoundException e) {
            System.out.println("File is not found");
            // e.printStackTrace();
        }
        // going to use hashmap to keep track of the words
        HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();


        while (textFile.hasNext()) {
			/*
			Storing the next scanned text into a new variable
			 */
            String text = textFile.next();

            //Punctuation clean uo. transform into elements in string to lowercase and eliminate punctuation marks
            text = text.toLowerCase();
            String[] word = text.split("\\p{Punct}", 0);

            // Creating For loop to go through array and store values into hashmap

            for (int i = 0; word.length > i; i++) {

                // used if scanned text is not already stored in hashmap
                if (!wordCounter.containsKey(word[i])) {
                    wordCounter.put(word[i], 1);
                }
                // If the word is already found then update the count within hashmap by 1
                else {
                    wordCounter.put(word[i], wordCounter.get(word[i]) + 1);

                }


            }

        }
        //using tree map to order it alphabetically
        TreeMap<String, Integer> treeMap = new TreeMap<>(wordCounter);
        System.out.println(treeMap.entrySet());

    }
}