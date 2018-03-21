import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String word;
        while (true) {
            System.out.println("Type a word: ");
            word = reader.nextLine();
            if (word.isEmpty()) {
                break;
            }
            words.add(word);
                    }
        for (String wordy : words) {
            System.out.println(wordy);
        }
    }

}
