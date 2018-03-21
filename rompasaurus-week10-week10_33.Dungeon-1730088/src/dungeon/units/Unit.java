package dungeon.units;

import java.util.Objects;
import java.util.Random;

public abstract class Unit {
    private int xLocation,yLocation;
    private char mapId;

    public Unit(int xLocation, int yLocation, char mapId) {
        this.xLocation = xLocation;
        this.yLocation = yLocation;
        this.mapId = mapId;
    }

    public int getxLocation() {
        return xLocation;
    }

    public void setxLocation(int xLocation) {
        this.xLocation = xLocation;
    }

    public int getyLocation() {
        return yLocation;
    }

    public void setyLocation(int yLocation) {
        this.yLocation = yLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //if (o == null || getClass() != o.getClass()) return false;
        Unit units = (Unit) o;
        return getxLocation() == units.getxLocation() &&
                getyLocation() == units.getyLocation();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getxLocation(), getyLocation());
    }

    @Override
    public String toString() {
        return mapId+"";
    }

    public void move(int xBound, int yBound, char move) {
        Random rand = new Random();
        char moveChar[] = {'w', 'a', 's', 'd'};
        if (move == 'a') {
            if (yLocation > 0) {
                yLocation--;
            }
        }else if (move == 'w') {
            if (xLocation > 0) {
                xLocation--;
            }
        }else if (move == 'd') {
            if (yLocation < yBound) {
                yLocation++;
            }
        }else if (move == 's') {
            if (xLocation < xBound) {
                xLocation++;
            }
        } else if (move == 'r') {
            this.move(xBound,yBound,moveChar[rand.nextInt(4)]);
        }
    }

}
