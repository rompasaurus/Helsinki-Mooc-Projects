package clicker.applicationlogic;

public class PersonalCalculator implements Calculator {

    private int count;

    @Override
    public int giveValue() {
        return count;
    }

    @Override
    public void increase() {
        count++;
    }
}
