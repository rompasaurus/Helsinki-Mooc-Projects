
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name = "empty";
        String number;
        ArrayList<Student> students = new ArrayList<Student>();
        while (!name.isEmpty()) {
            System.out.println("name: ");
            name= reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("studentnumber: ");
            number=reader.nextLine();
            students.add(new Student(name, number));
        }
        for (Student temp : students) {
            System.out.println(temp);
        }
        System.out.println("Give search term: ");
        String search = reader.nextLine();
        System.out.println("Result: ");

        for (Student temp : students) {
            if (temp.getName().contains(search) || temp.getStudentNumber().contains(search)) {
                System.out.println(temp);
            }
        }

        //System.out.println(students);

    }
}
