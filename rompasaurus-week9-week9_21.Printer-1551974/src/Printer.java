import java.io.File;
import java.util.Scanner;

public class Printer {
    private Scanner reader;
    private File file;
    public Printer(String Filename) throws Exception {
        file = new File(Filename);

    }
    public void printLinesWhichContain(String word) throws Exception{
        reader = new Scanner(file);
        String line = " ";
        while(reader.hasNext()){
            line = reader.nextLine();
            if (line.indexOf(word) >= 0) {
                System.out.println(line);
            }
        }
    }

}
