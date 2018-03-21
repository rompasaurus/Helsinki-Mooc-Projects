import java.util.Scanner;
public class GradesAndPoints{

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the point [0-60]: ");
        int points = Integer.parseInt(reader.nextLine());
        if(0<=points && points<30){
            System.out.println("Grade: failed");
        }else if(29<points && points<35){
            System.out.println("Grade: 1");
        }else if(34<points && points<40) {
            System.out.println("Grade: 2");
        }else if(39<points && points<45){
            System.out.println("Grade: 3");
        }else if(44<points && points<50){
            System.out.println("Grade: 4");
        }else if(49<points && points<61){
            System.out.println("Grade: 5");
        }
    }
}
