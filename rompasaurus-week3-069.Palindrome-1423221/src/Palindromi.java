import java.util.Scanner;

public class Palindromi {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        // First we create an empty string
        String result = "";

        // then the rest is copied to it one by one at reverse order
        int i = text.length() - 1;
        while (i >= 0) {
            result += text.charAt(i);  // same as result = result + text.charAt(i);
            i--;
        }

        return result;
    }
    public static boolean palindrome(String text) {
        return text.equals(reverse(text));

    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
