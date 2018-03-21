package boxes;

import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box {
    private int maxWeight;
    private List<Thing> things = new ArrayList<Thing>();

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int currentWeight() {
        int currentWeight=0;
        for (Thing thing : things) {
            currentWeight += thing.getWeight();
        }
        return currentWeight;
    }

    @Override

    public void add(Thing thing) {
        if (this.currentWeight() + thing.getWeight() <= maxWeight) {
            things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return things.contains(thing);
    }

}
