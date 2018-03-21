import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first number: ");
        int num = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        if(num>num2){
            System.out.println("Greater number "+ num);
        }else if(num2>num){
            System.out.println("Greater number "+ num2);
        }else{
            System.out.println("The Numbers are equal!");
        }
        
    }
}
