
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        String input;
        for(int i=0;i<=3;i++){
            System.out.println("Type the password: ");
            input= reader.nextLine();
            if(input.equals(password)){
                System.out.println("Right!\n");
                System.out.println("The secret is: jryy qbar!");
                break;
            }
            System.out.println("Wrong!");
                    }
        // Write your code here
    }
}
