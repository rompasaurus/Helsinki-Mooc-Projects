package farmsimulator;

import java.util.LinkedList;
import java.util.List;

public class Farm implements Alive{
    private String owner;
    private Barn barn;
    private List<Cow> cows = new LinkedList<Cow>();

    public Farm(String name, Barn barn) {
        this.owner = name;
        this.barn = barn;
    }

    public void addCow(Cow cow) {
        cows.add(cow);
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        String fOwner = "Farm owner: " + owner + "\n";
        String barnBulk = "Barn Bulk Tank: " + barn.getBulkTank().toString() + "\n";
        String sCows = "No cows.";
        if (!cows.isEmpty()) {
            sCows="Animals: \n";
            for (Cow cow : cows) {
                sCows +="  "+ cow +"\n";
            }
        }
        return fOwner + barnBulk + sCows;
    }

    @Override
    public void liveHour() {
        for (Cow cow : cows) {
            cow.liveHour();
        }
    }

    public void manageCows(){
        barn.takeCareOf(cows);
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        barn.installMilkingRobot(milkingRobot);
    }
}
