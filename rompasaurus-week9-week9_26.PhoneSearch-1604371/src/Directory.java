import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Directory {
    private List<Person> directory = new ArrayList<Person>();

    public Directory(List<Person> directory) {
        this.directory = directory;
    }

    public void addPerson(Person person) {
        directory.add(person);
    }

    public void deletePerson(String name) {
        Iterator<Person> iter = directory.iterator();

        while(iter.hasNext()){
            Person person = iter.next();
            if (person.getName().equals(name)) {
                iter.remove();
            }
        }
    }
    public Person searchByName(String name) {
        for (Person person : directory) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    public Person searchByNumber(String number) {
        List<String> numbers = new ArrayList<String>();
        for (Person person : directory) {
            numbers = person.getNumbers();
            for(String num:numbers){
                if (num.equals(number)) {
                    return person;
                }

            }
        }
        return null;
    }

    public List<Person> searchByString(String string) {
        List<Person> people = new ArrayList<Person>();
        Collections.sort(directory);
        for (Person person : directory) {
            if (person.getName().contains(string)|| person.getAddress().contains(string)) {
                people.add(person);
            }
        }
        return people;
    }

    public void printDirectory() {
        for (Person person : directory) {
            person.printPerson();
        }

    }
}
