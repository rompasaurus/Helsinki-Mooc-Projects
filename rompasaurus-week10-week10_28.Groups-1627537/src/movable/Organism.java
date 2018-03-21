package movable;

public class Organism implements Movable {
    private int xCoordinate;
    private int yCoordinate;

    public Organism(int x, int y) {
        this.xCoordinate = x;
        this.yCoordinate = y;
    }

    @Override
    public String toString() {
        return "x: " + xCoordinate + "; y: " + yCoordinate;
    }

    @Override
    public void move(int dx, int dy) {
        this.xCoordinate += dx;
        this.yCoordinate += dy;
    }
}
