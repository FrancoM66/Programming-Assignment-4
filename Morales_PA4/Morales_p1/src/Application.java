
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application {
    public static void main (String[] args) throws IOException {

        // Try to open file
        System.out.println("Opening file problem1.txt...");

        FileInputStream fileIn = new FileInputStream("problem1.txt");
        Scanner dataFile = new Scanner(fileIn);

        FileOutputStream fileOut = new FileOutputStream("unique_words.txt");
        PrintWriter fileWrite = new PrintWriter(fileOut);

        System.out.println("Duplicate words removed and added to unique_words.txt...");

        DuplicateRemover.remove(dataFile);
        DuplicateRemover.write(fileWrite);
        fileWrite.close ();

    }
}