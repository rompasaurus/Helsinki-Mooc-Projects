import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;

import java.util.ArrayList;
import java.util.List;

public class Person implements Comparable<Person> {
    private String name;
    private List<String> numbers = new ArrayList<String>();
    private String address;

    public Person(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addNumbers(String numbers) {
        this.numbers.add(numbers);
    }

    public String getName() {
        return name;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public String getAddress() {
        return address + "";
    }

    public void printName() {
        System.out.println(" " + name);
    }

    public void printNumbers() {
        if (numbers.isEmpty()) {
            System.out.println("  phone number not found");
            return;
        }
        for (String number : numbers) {
            System.out.println("   " + number);
        }
    }

    public void printPersonalInfo() {
        if (address == null) {
            System.out.println("  address unknown");
        } else {
            System.out.println("  address: " + address);
        }
        System.out.println("  phone numbers:");
        printNumbers();
    }

    public void printPerson() {
        System.out.println("  " + name);
        printPersonalInfo();
    }

    public int compareTo(Person person) {
        return this.name.compareTo(person.getName());
    }
}
