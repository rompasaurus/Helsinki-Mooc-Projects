
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num=Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int num2=Integer.parseInt(reader.nextLine());
        double div = (double) num/(double) num2;
        System.out.println("\nDivision:  "+num+" / "+ num2 + " = "+div);


        // Implement your program here. Remember to ask the input from user.
    }
}
