import java.util.ArrayList;

public class Container {
    private ArrayList<Suitcase> suitcases = new ArrayList<Suitcase>();
    private int maxWeight;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.currentWeight() + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }
    }

    public String toString() {
        return suitcases.size() + " suitcases (" + currentWeight() + "kg)";
    }

    public int currentWeight() {
        int currentWeight=0;
        for (Suitcase suitcase : suitcases) {
            currentWeight+=suitcase.totalWeight();
        }
        return currentWeight;
    }

    public void printThings() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printThings();
        }
    }
}
