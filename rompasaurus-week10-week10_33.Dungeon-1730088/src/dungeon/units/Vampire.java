package dungeon.units;

public class Vampire extends Unit {
    private boolean canMove;
    private boolean isAlive;

    public Vampire(int xLocation, int yLocation, boolean canMove) {
        super(xLocation, yLocation, 'v');
        this.canMove = canMove;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public boolean isCanMove() {

        return canMove;
    }

    public void setAlive(boolean alive) {

        isAlive = alive;
    }

    public void setCanMove(boolean canMove) {

        this.canMove = canMove;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    public void move(int xBound, int yBound) {
        if (canMove) {
            super.move(xBound, yBound, 'r');
        }
    }
}
