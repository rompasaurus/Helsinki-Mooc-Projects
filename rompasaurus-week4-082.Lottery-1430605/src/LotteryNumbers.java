import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        Random random = new Random();
        this.numbers = new ArrayList<Integer>();
        int rando=0;
        int i=0;
        while(i < 7){
            rando = 1 + random.nextInt(39);
            if (!containsNumber(rando)) {
                this.numbers.add(rando);
                i++;
            }

        }
        // Write the number drawing here using the method containsNumber()
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        return this.numbers.contains(number);
    }
}
