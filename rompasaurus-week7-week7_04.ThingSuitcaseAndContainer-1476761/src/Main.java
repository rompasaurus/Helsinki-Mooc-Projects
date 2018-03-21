public class Main {
    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        for(int weight=1;weight<100;weight++) {
            Suitcase brickBag = new Suitcase(weight);
            Thing brick = new Thing("brick",weight);
            brickBag.addThing(brick);
            container.addSuitcase(brickBag);
        }
    }
}