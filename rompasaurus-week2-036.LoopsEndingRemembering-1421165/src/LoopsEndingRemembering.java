import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int input = 0;
        int sum=0;
        int counter=0;
        int odd=0;
        int even=0;
        double average=0;
        while (true) {
            System.out.println("Type numbers");
            input = Integer.parseInt(reader.nextLine());

            if(input<0){
                break;
            }
            sum+=input;
            counter++;
            average=(double)sum/counter;
            if(input%2!=0){
                odd++;
            }else{
                even++;
            }

        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is "+sum);
        System.out.println("How many numbers: "+counter);
        System.out.println("Average "+average);
        System.out.println("Even numbers: "+ even);
        System.out.println("Odd numbers: "+odd);
            }
}
