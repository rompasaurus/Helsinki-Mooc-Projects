import java.util.ArrayList;

public class Changer {
    private ArrayList<Change> changes = new ArrayList<Change>();

    public void addChange(Change change) {
        changes.add(change);
    }
    public String change(String characterString) {
        String changedWord = characterString;
        for (Change change : changes) {
            changedWord = change.change(changedWord);
        }
        return changedWord;
    }


}
