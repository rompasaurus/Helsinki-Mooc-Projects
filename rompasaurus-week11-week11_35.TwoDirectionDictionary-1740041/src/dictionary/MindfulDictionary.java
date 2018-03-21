package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class MindfulDictionary {
    private String dictionary = "src/words.txt";
    private File dict ;
    private Scanner reader;

    public  MindfulDictionary() {
        load();
    }

    public MindfulDictionary(String file) {
        dictionary = file;
        new MindfulDictionary();
    }

    public boolean load() {
        dict = new File(dictionary);
        return dict.exists();
    }

    public void add(String word, String translation) {
        FileWriter writer;
        try {
            writer = new FileWriter(dictionary,true);
            if (translate(word) == null) {
                writer.write(word + ":" + translation + "\n");
                writer.close();
            }
        } catch (Exception e) {
            System.out.println("that aint a file");
            return;
        }
    }

    public String translate(String word){
        try {
            reader = new Scanner(dict);
            String line = "";
            String separatedLine[];
            while (reader.hasNext()) {
                line = reader.nextLine();
                separatedLine = line.split(":");
                if (separatedLine[0].equals(word)) {
                    return separatedLine[1];
                }
                if (separatedLine[1].equals(word)) {
                    return separatedLine[0];
                }
            }
            return null;
        } catch (Exception e) {
            System.out.println("get outa here with that shit");
            return null;
        }

    }

    public void remove(String word) {
        try {
            reader = new Scanner(dict);
            String line = "";
            String separatedLine[];
            String dictS = "";
            while (reader.hasNext()) {
                line = reader.nextLine();
                separatedLine = line.split(":");
                if (!separatedLine[0].equals(word) && !separatedLine[1].equals(word)) {
                    dictS += line + "\n";
                }

            }
            writeToFile(dictionary,dictS);
            //System.out.println(dictS);
        } catch (Exception e) {
            System.out.println("something went wrong");
            return;
        }
    }
    public void writeToFile(String fileName, String text) throws Exception {
        FileWriter writer = new FileWriter(fileName);
        writer.write(text);
        writer.close();
    }

    public void appendToFile(String fileName, String text) throws Exception {
        FileWriter writer = new FileWriter(fileName, true);
        writer.write(text);
        writer.close();
    }

    public boolean save() {
        return true;
    }
}
