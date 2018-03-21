import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class UserInterface {
    private Scanner reader = new Scanner(System.in);
    private Directory directory;

    public UserInterface(Directory directory) {
        this.directory = directory;
    }

    public void menu() {
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
    }

    public void commands() {
        String input = " ";
        while(input!="x") {
            System.out.print("command: ");
            input =reader.nextLine();
            if (input.equals("1")) {
                addANumber();
            } else if (input.equals("2")) {
                searchForNumber();
            } else if (input.equals("3")) {
                searchByNumber();
            } else if (input.equals("4")) {
                addAddress();
            } else if (input.equals("5")) {
                displayPerson();
            } else if (input.equals("6")) {
                deletePerson();
            } else if (input.equals("7")) {
                filterList();
            } else if (input.equals("x")) {
                return;
            } else {
                System.out.println("invalid input");
            }
        }
    }
    public void addANumber(){
        String name = promptName();
        String number = promptNumber();
        if(directory.searchByName(name)==null){
            Person person = new Person(name);
            person.addNumbers(number);
            directory.addPerson(person);
        }else{
            directory.searchByName(name).addNumbers(number);
        }
        System.out.println();
    }

    public void searchForNumber() {
        String name = promptName();
        if (directory.searchByName(name) == null) {
            System.out.println("  not found");
        }else{
            directory.searchByName(name).printNumbers();
        }
        System.out.println();
    }

    public void searchByNumber() {
        String number = promptNumber();
        if(directory.searchByNumber(number)==null){
            System.out.println("  not found");
        }else{
            directory.searchByNumber(number).printName();
        }
        System.out.println();
    }

    public void addAddress() {
        String name = promptAddressName();
        String address = promptAddress();
        if(directory.searchByName(name)==null){
            Person person = new Person(name);
            person.setAddress(address);
            directory.addPerson(person);
        }else{
            directory.searchByName(name).setAddress(address);
        }
        System.out.println();
    }

    public void displayPerson() {
        String name = promptInformation();
        if (directory.searchByName(name) == null) {
            System.out.println("  not found");
        }else{
            directory.searchByName(name).printPersonalInfo();
        }
    }

    public void deletePerson() {
        String name = promptInformation();
        if (directory.searchByName(name) == null) {
            System.out.println("  not found");
        }else{
            directory.deletePerson(name);
        }
    }

    public void filterList() {
        System.out.println("keyword (if empty, all listed): ");
        String keyword = reader.nextLine();
        if (keyword.isEmpty()) {
            directory.printDirectory();
        }else{
            List<Person> people = directory.searchByString(keyword);
            if(people.isEmpty()){
                System.out.println(" keyword not found");
                return;
            }
            for (Person person : people) {
                person.printPerson();
            }
        }
        System.out.println();
    }
    public String promptName() {
        System.out.print("whose number: ");
        String number = reader.nextLine();
        return number;
    }
    public String promptAddressName() {
        System.out.print("whose address: ");
        String name = reader.nextLine();
        return name;
    }
    public String promptNumber() {
        System.out.print("number: ");
        String number = reader.nextLine();
        return number;
    }
    public String promptAddress() {
        System.out.print("street: ");
        String address = reader.nextLine();
        System.out.print("city: ");
        address+= " "+reader.nextLine();
        return address;
    }
    public String promptInformation(){
        System.out.print("whose information: ");
        String name = reader.nextLine();
        return name;
    }

}
