package tools;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {
    private List<String> characterStrings = new ArrayList<String>();
    private Set<String> uniqueStringSet = new HashSet<String>(); 
    
    public void add(String characterString){
        characterStrings.add(characterString);
        uniqueStringSet.add(characterString);
    }
        //stores a characterString if it's not a duplicate.
    public int getNumberOfDetectedDuplicates(){
        return characterStrings.size() - uniqueStringSet.size();
    }
        //returns the number of detected duplicates.
    public Set<String> getUniqueCharacterStrings(){
        return uniqueStringSet;
    }
        //returns an object which implements the interface Set<String>. Object should have all unique characterStrings (no duplicates!). If there are no unique characterStrings, method returns an empty set.
    public void empty(){
        characterStrings.clear();
        uniqueStringSet.clear();
    }
        //removes stored characterStrings and resets the amount of detected duplicates.
}

