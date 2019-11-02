
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateRemover {

    private static ArrayList<String> uniqueWords = new ArrayList<>();

    public static void remove(Scanner dataFile)
    {

        while(dataFile.hasNext()){

            String word = dataFile.next();

            if(!uniqueWords.contains(word)){
                uniqueWords.add(word);
            }
        }
    }

    public static void write(PrintWriter fileWrite)
    {
        for(int i = 0; i <= uniqueWords.size()-1; i++){
            fileWrite.println(uniqueWords.get(i));
        }
    }

}


/*
Create a utility class called DuplicateRemover.

Create an instance method called remove that takes a single parameter called dataFile
(representing the path to a text file) and uses a Set of Strings to eliminate duplicate words from dataFile.

The unique words should be stored in an instance variable called uniqueWords.

Create an instance method called write that takes a single parameter called outputFile
(representing the path to a text file) and writes the words contained in uniqueWords to
the file pointed to by outputFile.

The output file should be overwritten if it already exists, and created if it does not exist.
 */