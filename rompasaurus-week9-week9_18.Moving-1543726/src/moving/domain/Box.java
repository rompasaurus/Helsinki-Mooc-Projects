package moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {
    private int maximumCapacity;
    
    private List<Thing> things = new ArrayList<Thing>();

    public int currentVolume(){
        int volume = 0;
        for(Thing thing: things){
            volume+=thing.getVolume();
        }
        return volume;
    }
        

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public boolean addThing(Thing thing) {
        if (thing.getVolume() + currentVolume() <= maximumCapacity) {
            things.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        return currentVolume();
    }
    
    public String toString(){
        return ""+currentVolume();
    }
}
