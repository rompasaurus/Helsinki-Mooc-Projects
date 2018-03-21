package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {
    private List<Movable> movableItems = new ArrayList<Movable>();

    public void addToGroup(Movable item) {
        movableItems.add(item);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable item : movableItems) {
            item.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String tS = "";
        for (Movable item : movableItems){
            tS += item.toString() + "\n";
        }
        return tS;
    }
}
