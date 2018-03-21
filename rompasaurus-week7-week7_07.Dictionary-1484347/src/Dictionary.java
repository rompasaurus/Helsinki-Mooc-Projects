import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> dictionary = new HashMap<String, String>();

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }
        return null;
    }

    public void add(String word, String translation) {
        dictionary.put(word, translation);
    }

    public int amountOfWords() {
        return dictionary.size();
    }

    public ArrayList<String> translationList() {
        //System.out.println(this.dictionary.values());
        ArrayList<String> translations = new ArrayList<String>();
        for (String key : this.dictionary.keySet()) {
            translations.add(key + " = " + dictionary.get(key));
        }
        return translations;

    }

}
