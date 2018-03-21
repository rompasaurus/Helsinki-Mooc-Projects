package dungeon;

import dungeon.units.Unit;
import dungeon.units.UnitChecker;
import dungeon.units.Vampire;

import java.util.ArrayList;
import java.util.List;

public class Map {
    private int xMax, yMax;
    private List<Unit> Units;

    public Map(int x, int y, List<Unit> Units) {
        this.xMax = x;
        this.yMax = y;
        this.Units = Units;
    }

    public void addUnit(Unit unit){
        Units.add(unit);
    }

    public void drawMap() {
        for (int x = 0; x < this.xMax; x++) {
           System.out.println();
            for (int y = 0; y < this.yMax; y++) {
                Unit check = new UnitChecker(x,y);
                if (checkLocation(check)!=null) {
                    System.out.print(checkLocation(check));
                } else {
                    System.out.print(check);
                }
            }
        }
    }

    public void printLocations() {

        for (Unit unit : Units) {
            System.out.println(unit + " " + unit.getyLocation() + " " + unit.getxLocation());
        }
    }

    public Unit checkLocation(Unit check) {
        for (Unit unit : Units) {
            if (unit.equals(check)&&check.getClass()!=unit.getClass()) {
                return unit;
            }
        }
        return null;
    }

    public void moveVamps(List<Vampire> vamps) {
        Vampire tempVamp = new Vampire(0,0,true);
        for (Vampire vamp : vamps) {
            tempVamp.setxLocation(vamp.getxLocation());
            tempVamp.setyLocation(vamp.getyLocation());
            tempVamp.setCanMove(vamp.isCanMove());
            tempVamp.move(xMax,yMax);
            vamp.move(xMax,yMax);
            if(checkLocation(tempVamp)==null){
                vamp = tempVamp;
            }
        }
    }
    public Unit checkAndDelete(Unit check) {
        Unit remove = null;
        for (Unit unit : Units) {
            if (unit.equals(check)&&check.getClass()!=unit.getClass()) {
                remove=unit;
                //System.out.println(unit+" "+unit.getyLocation());
            }
        }
        if (remove != null) {
            Units.remove(remove);
        }
        return null;
    }

}
