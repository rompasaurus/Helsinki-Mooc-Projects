package people;

public class Person {
    private String address;
    private String name;

    public Person(String name, String address) {
        this.address = address;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "\n  " + address;
    }
}
