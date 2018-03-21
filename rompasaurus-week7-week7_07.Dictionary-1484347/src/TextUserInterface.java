import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader=reader;
        this.dictionary = dictionary;
    }

    public void start() {
        String input="", input2 = "";
        while (!input.equals("quit")) {
            System.out.println("Statement: ");
            input = reader.nextLine();
            if (input.equals("add")) {
                System.out.print("In Finnish: ");
                input = reader.nextLine();
                System.out.print("Translations: ");
                input2 = reader.nextLine();
                dictionary.add(input, input2);
            } else if (input.equals("translate")) {
                System.out.print("Give a word: ");
                input = reader.nextLine();
                System.out.println("Translation: " + dictionary.translate(input));

            } else {
                System.out.println("Unknown statement");

            }
        }

    }
}
