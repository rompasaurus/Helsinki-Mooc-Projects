
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        boolean nodupes = true;
        String word = "";
        
        
        while (nodupes) {
            System.out.println("Type a word: ");
            word = reader.nextLine();
            if (words.contains(word)) {
                nodupes = false;
                System.out.println("You gave the word " + word + " twice");
            }

            words.add(word);
        }

    }
}
