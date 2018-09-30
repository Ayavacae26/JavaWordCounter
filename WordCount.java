import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author  Erik Ayavaca-Tirado
 * Iteration 1
 * As of 9/26//18 - output is ordered alphabetically
 * This is a word counter that will taken in a txt file and then scan in the words in said file and
 * output the different words and the number of occurances each had.
 */

public class WordCount {
    private File inputFile;

    public WordCount(File file) {
        this.inputFile = file;
    }

    public void wordCount() {
        // Here we are setting up the scanner to take in a file
        Scanner textFile = new Scanner(System.in);

        try {
            //pointing to the file into the scanner
            textFile = new Scanner(inputFile);
        }
        // Will output if inout file is not found.
        catch (FileNotFoundException e) {
            System.out.println("File is not found");
            return;
        }
        // going to use hashmap to keep track of the words
        HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();

        //Only occurs if the text has a next line
        while (textFile.hasNext()) {
			/*
			Storing the next scanned text into a new variable
			 */
            String text = textFile.next();

            //Punctuation clean uo. transform into elements in string to lowercase and eliminate punctuation marks
            text = text.toLowerCase();
            String[] word = text.split("[^a-z\\^'\\^\\d]", 0);

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
        //using tree map to order it alphabetically. Putting in the hashmap into treemap for ordering purposes
        TreeMap<String, Integer> treeMap = new TreeMap<>(wordCounter);

        // Using this inorder to go through the hashmap to get the total words in the file
        int counter = 0;
        for (HashMap.Entry<String, Integer> Total : wordCounter.entrySet()) {
            counter = Total.getValue() + counter;
        }


        //Output is printed in the alphabetical order
        System.out.println(treeMap.entrySet());

        // Total words in the text file
        System.out.println("Total words are: " + counter);

        //Unique words that appear in the file
        System.out.println("Total # of unique words in this text file is:  " + wordCounter.size());

    }
}


