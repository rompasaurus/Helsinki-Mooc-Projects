import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> DB = new ArrayList<Person>();
        Directory directory = new Directory(DB);
        UserInterface directoryInterface = new UserInterface(directory);
        directoryInterface.menu();
        directoryInterface.commands();

    }
}
