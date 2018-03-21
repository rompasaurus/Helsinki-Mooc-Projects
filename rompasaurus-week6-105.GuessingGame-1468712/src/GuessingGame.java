import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
        //lowerLimit--;
        //upperLimit++;
        int halve = average(lowerLimit, upperLimit);
        //int halve = average(lowerLimit, upperLimit);
        int oldLower = lowerLimit;
        int oldHigher = lowerLimit;
        while (true) {
            System.out.println(halve);
            System.out.println(lowerLimit);
            System.out.println(upperLimit);
            halve = average(lowerLimit, upperLimit);
            if (isGreaterThan(halve)) {
                //oldLower=lowerLimit;
                
                if (halve==lowerLimit||halve==upperLimit-1) {
                    System.out.println("The number you're thinking of is " + upperLimit + ".");
                    break;
                }
                lowerLimit = halve+1;
            } else {
                //oldHigher=upperLimit;
                
                if (halve==upperLimit) {
                    System.out.println("The number you're thinking of is " + lowerLimit + ".");
                    break;
                }
                upperLimit = halve;
            }
            if (upperLimit==lowerLimit) {
                //halve++;
                System.out.println("The number you're thinking of is " + halve + ".");
                break;
            }


        }
        // write the guessing logic here

    }

    // implement here the methods isGreaterThan and average

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }

    public boolean isGreaterThan(int value) {
        System.out.println("Is your number greater than "+ value+ "? (y/n)");
        String response = reader.nextLine();
        if (response.equals("y")) {
            return true;
        } else {
            return false;
        }
    }

    public int average(int first, int second) {
        return (first + second) / 2;
    }
}