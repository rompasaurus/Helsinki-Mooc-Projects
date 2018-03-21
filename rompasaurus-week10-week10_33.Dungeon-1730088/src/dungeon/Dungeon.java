package dungeon;

import dungeon.units.Player;
import dungeon.units.Unit;
import dungeon.units.Vampire;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Dungeon {
    private int length, height,vampires,moves;
    private boolean vampiresMove;
    private List<Unit> units = new ArrayList<Unit>();
    private Map map;
    private Scanner reader = new Scanner(System.in);
    private Player player = new Player(0,0);
    private List<Vampire> vamps = new ArrayList<Vampire>();

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.height = height;
        this.length = length;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
    }

    public void run(){
        generateUnits();
        generateMap();
        while (moves > 0) {
            System.out.println(moves);
            System.out.println();
            map.printLocations();
            map.drawMap();
            gatherInput();
            if (units.size() <= 1) {
                moves = 0;
                //map.drawMap();
                System.out.println("YOU WIN");
                return;
            }
        }
        System.out.println("YOU LOSE");
    }

    public void generateUnits(){
        units.add(player);
        generateVampires();
    }

    public void generateVampires() {
        Random rand = new Random();
        Boolean canAdd;
        while (units.size() < vampires + 1) {
            canAdd=true;
            Vampire newVamp = new Vampire(rand.nextInt(length),rand.nextInt(height),vampiresMove);
            for(Unit unit: units){
                if (unit.equals(newVamp)) {
                    canAdd=false;
                }
            }
            if (canAdd) {
                units.add(newVamp);
                vamps.add(newVamp);
            }
        }
    }

    public void generateMap() {
        map = new Map(length, height,units);
    }

    public void gatherInput() {
        System.out.println();
        String input = reader.nextLine();
        Player playerCopy = new Player(player.getxLocation(),player.getyLocation());
            for(int i =0;i<input.length();i++) {
                playerCopy.move(length-1, height-1, input.charAt(i));
                map.checkAndDelete(playerCopy);
                map.moveVamps(vamps);
            }

        player.setxLocation(playerCopy.getxLocation());
        player.setyLocation(playerCopy.getyLocation());

        moves--;
    }

}
