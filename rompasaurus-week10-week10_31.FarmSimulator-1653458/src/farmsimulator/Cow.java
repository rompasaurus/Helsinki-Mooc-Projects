package farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive {
    private Random rand = new Random();
    private double udderCapacity;
    private double amount;
    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    private String name = NAMES[rand.nextInt(NAMES.length)];

    public Cow(String name) {
        this();

        this.name = name;
    }

    public Cow() {
        udderCapacity = 15 + rand.nextInt(26);
    }


    public double getCapacity() {
        return udderCapacity;
    }

    public double getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " "+ amount + "/" + udderCapacity;
    }

    @Override
    public double milk() {
        double pAmmount = amount;
        amount = 0;
        return pAmmount;
    }

    @Override
    public void liveHour() {
        double milkAmount = Math.ceil(.7 + rand.nextDouble());
        amount +=  milkAmount;
        if (amount > udderCapacity) {
            amount = udderCapacity;
        }
    }
}
