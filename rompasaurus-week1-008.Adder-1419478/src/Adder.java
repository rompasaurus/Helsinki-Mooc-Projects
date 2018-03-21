
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int digit1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int digit2 = Integer.parseInt(reader.nextLine());
        int sum = digit1+digit2;
        System.out.print("\nSum of the numbers: "+sum);

        // Implement your program here. Remember to ask the input from user
    }
}
