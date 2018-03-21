
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        //String str="";
        if ((null == text) || (text.length() <= 1)) {
            return text;
        }
        return reverse(text.substring(1)) + text.charAt(0);
    }


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }

}
