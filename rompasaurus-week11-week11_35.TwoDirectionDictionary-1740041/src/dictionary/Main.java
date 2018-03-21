package dictionary;

public class Main {
    public static void main(String[] args) {
        MindfulDictionary s = new MindfulDictionary();
        s.add("apina", "monkey");
        s.add("tietokone", "computer");
        s.remove("apina");
        System.out.println(s.translate("tietokone"));
    }
}
