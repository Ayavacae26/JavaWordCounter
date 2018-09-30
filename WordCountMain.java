import java.io.* ;
import java.util.Scanner;

public class WordCountMain {
    public static void main(String[] args){
        TempWindow tw = new TempWindow();
        tw.setVisible(true);

        File input = new File(args[0]);
        WordCount files = new WordCount(input);
        files.wordCount();
    }
}
