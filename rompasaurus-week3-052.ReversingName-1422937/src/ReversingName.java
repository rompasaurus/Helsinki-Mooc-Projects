import java.util.Scanner;

import static java.lang.System.*;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();

        int i = name.length() - 1;
        System.out.println("In reverse order: ");
        while (i >= 0) {
            System.out.print(name.charAt(i));
            i--;

        }
    }
}
