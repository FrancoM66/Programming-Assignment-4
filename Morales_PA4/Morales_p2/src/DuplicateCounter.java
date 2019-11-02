
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateCounter {

    private static ArrayList<String> allWords = new ArrayList<>();

    public static void count(Scanner dataFile) {

        while (dataFile.hasNext()) {

            String word = dataFile.next();

            allWords.add(word);
        }

    }

    public static void writer(PrintWriter fileWrite) {

        ArrayList<String> completedWords = new ArrayList<>();

        for (int i = 0; i <= allWords.size() - 1; i++) {
            String testCase = allWords.get(i);
            if(!completedWords.contains(testCase)){
                int counter = 0;

                for (int j = i; j <= allWords.size() - 1; j++) {
                    if(allWords.get(j).equals(testCase)){
                        counter++;
                    }
                }
                completedWords.add(testCase);
                fileWrite.println(testCase + " " + counter);
            }
        }
    }
}
