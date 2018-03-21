package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection{
    private File file;
    private final String vowels = "aeiouyäö";
    private Scanner reader;
    private ArrayList<String> words= new ArrayList<String>();

    public WordInspection(File file)throws Exception{
        this.file = file;
        readFile();
    }

    public void readFile(){
        try {
            reader = new Scanner(file, "UTF-8");
            ArrayList<String> words = new ArrayList<String>();
            while (reader.hasNext()) {
                words.add(reader.nextLine());
            }
            this.words = words;
        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        }
    }

    public int wordCount() {
        return words.size();
    }

    public List<String> wordsContainingZ(){
        List<String> zWords = new ArrayList<String>();
        for (String word : words) {
            if (word.indexOf('z') >= 0) {
                zWords.add(word);
            }
        }
        return zWords;
    }

    public List<String> wordsEndingInL(){
        List<String> lWords = new ArrayList<String>();
        for (String word : words) {
            if (word.lastIndexOf('l') == word.length()-1) {
                lWords.add(word);
            }
        }
        return lWords;
    }

    public List<String> palindromes(){
        List<String> palindromes = new ArrayList<String>();
        for (String word : words) {
            boolean isPalidrome=true;
            for(int i = 0;i<=word.length()-(1+i);i++){
                if (word.charAt(i) != word.charAt(word.length() - (1 + i))) {
                    isPalidrome = false;
                }
            }
            if (isPalidrome) {
                palindromes.add(word);
            }
        }
        return palindromes;
    }

    public List<String> wordsWhichContainAllVowels(){
        List<String> returnedString = new ArrayList<String>();
        for(String word : words){
            if(containsAllVowels(word)){
                returnedString.add(word);
            }
        }
        return returnedString;
    }

    private boolean containsAllVowels(String word){
        for(char vowel : this.vowels.toCharArray()){
            if(!word.contains(""+vowel)){
                return false;
            }
        }
        return true;
    }



}
