package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, Set<String>> translations= new HashMap<String,Set<String>>(); 
    
    public void add(String word, String entry){
        Set<String> entries = new HashSet<String>();
        if(translations.containsKey(word)){
            entries =translations.get(word);
            entries.add(entry);
        }else{
        
        entries.add(entry);
        translations.put(word, entries);            
        }
    }
    public Set<String> translate(String word){
        if(translations.containsKey(word)){
            Set<String> entries = new HashSet<String>();
            entries = translations.get(word);
            return entries;
        }
        return null;
    }
    public void remove(String word){
        if(translations.containsKey(word)){
            translations.remove(word);
        }
    }
}
