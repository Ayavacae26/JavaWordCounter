import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;


public class WordCount {
	public static void main(String[] args) {
	
	HashMap<String, Integer> map = new HashMap<String, Integer>(); 
	File filename = new File("/Users/erikayavaca/Desktop/Erik Ayavaca.txt");
	Scanner scan = null;
	
	try {
		scan = new Scanner(filename);
		while(scan.hasNextLine()) {
	
			System.out.println(scan.nextLine());
		}
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
		
	}
	



}
}