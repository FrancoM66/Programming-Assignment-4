
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Application {
    public static void main (String[] args) throws IOException {

        // Try to open file
        System.out.println("Opening file problem2.txt...");

        FileInputStream fileIn = new FileInputStream("problem2.txt");
        Scanner dataFile = new Scanner(fileIn);

        FileOutputStream fileOut = new FileOutputStream("unique_word_counts.txt");
        PrintWriter fileWrite = new PrintWriter(fileOut);

        System.out.println("Word count inside of unique_word_counts.txt...");

        DuplicateCounter.count(dataFile);
        DuplicateCounter.writer(fileWrite);
        fileWrite.close();

    }



}

