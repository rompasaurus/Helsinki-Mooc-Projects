
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {

    }

    public void addNumber(int number) {
        this.amountOfNumbers++;
        this.sum+=number;

    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        if(amountOfNumbers==0){
            return amountOfNumbers;
        }
        return (double) sum / amountOfNumbers;
    }
}
