import java.io.* ;
import java.util.Scanner;

public class WordCountMain {
    public static void main(String[] args){

        File input = new File(args[0]);
        WordCount files = new WordCount(input);
        files.wordCount();
    }
}
