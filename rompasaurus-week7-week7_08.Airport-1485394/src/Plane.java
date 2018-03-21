public class Plane {
    private String planeId;
    private int capacity;

    public Plane(String planeId, int capacity) {
        this.planeId = planeId;
        this.capacity = capacity;
    }

    public String getPlaneId() {
        return planeId;
    }

    public int getCapacity() {
        return capacity;
    }

    public String toString() {
        return planeId + " (" + capacity + " ppl)";
    }
}
