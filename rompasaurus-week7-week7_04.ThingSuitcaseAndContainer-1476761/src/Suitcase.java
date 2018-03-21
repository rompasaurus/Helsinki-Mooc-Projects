import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Thing> things;
    private int maxWeight;

    public Suitcase(int maxWeight){
        things = new ArrayList<Thing>();
        this.maxWeight=maxWeight;
    }

    public void addThing(Thing thing) {
        if(this.totalWeight()+thing.getWeight()<=maxWeight) {
            things.add(thing);
        }
    }

    public String toString() {
        if (things.size() == 0) {
            return "empty (0 kgs)";
        }
        if (things.size() == 1) {
            return things.size() + " thing ("+this.totalWeight()+" kg)";
        }
        return things.size() + " things ("+this.totalWeight()+" kg)";
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }

    public int totalWeight() {
        int currentWeight = 0;
        for (Thing thing : things) {
            currentWeight+=thing.getWeight();
        }
        return currentWeight;
    }

    public Thing heaviestThing() {
        Thing heavy = new Thing();
        if(things.isEmpty()){
            return null;
        }
        for (Thing thing : things) {
            if (thing.getWeight() > heavy.getWeight()) {
                heavy = thing;
            }
        }
        return heavy;
    }


}
