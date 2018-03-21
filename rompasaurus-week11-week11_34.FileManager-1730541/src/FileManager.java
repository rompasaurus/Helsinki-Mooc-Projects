
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public ArrayList<String> read(String file){
        File fileName = new File(file);
        Scanner reader = null;
        ArrayList<String> read = new ArrayList<String>();
        //read.add("shit is empty");
        //read.add("empty as fuuk");
        try {
            reader = new Scanner(fileName);
        } catch (Exception e) {
            System.out.println("mutha fucka that aint no file that exists");
            return read;
        }
        while (reader.hasNext()) {
            read.add(reader.nextLine());
        }
        return read;
    }

    public void save(String file, String text) throws IOException {
        FileWriter writer = new FileWriter(file, true);
        writer.write(text);
        writer.close();

    }

    public void save(String file, List<String> texts) throws IOException {
        for (String words : texts) {
            save(file,words+"\n");
        }
    }
}
