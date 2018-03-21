
public class StringUtils {
    public static boolean included(String word, String searched){

        word=word.toUpperCase().trim();
        searched=searched.toUpperCase().trim();

        return word.contains(searched);
        

    }
}
