package file;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Analysis {
    private Scanner reader;
    //private File file;
    private ArrayList<String> lines = new ArrayList<String>();

    public Analysis(File file) throws Exception {
        //file = new File(fileName);
        reader = new Scanner(file);
        String line="";
        while (reader.hasNext()) {
            line=reader.nextLine();
            lines.add(line);
        }
    }

    public int lines() {
        return lines.size();
    }

    public int characters(){
        int numberOfCharacters = 0;
        for(String line:lines){
            numberOfCharacters += line.length();
        }
        return numberOfCharacters+ lines.size();
    }
}
