import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics totes = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd    = new NumberStatistics();
        int i=0;
        System.out.println("Type numbers:");
        while (i >= 0) {
            i = Integer.parseInt(reader.nextLine());
            if(i<0){
                break;
            }
            if (i % 2 == 0) {
                even.addNumber(i);
                totes.addNumber(i);
            } else {
                odd.addNumber(i);
                totes.addNumber(i);
            }
        }
        System.out.println("sum: " + totes.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: "+odd.sum());

    }
}
