public class Reformatory {
private int weightCounter;
    public int weight(Person person) {
        weightCounter++;
        return person.getWeight();
        // return the weight of the person
    }

    public void feed(Person person) {
        person.setWeight(weight(person) + 1);
    }

    public int totalWeightsMeasured() {
        return weightCounter;

    }

}
