
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations requested in the assignment here!
        HashMap<String, String> nickNames = new HashMap<String,String>();
        nickNames.put("matti", "mage");
        nickNames.put("mikael", "mixu");
        nickNames.put("arto", "arppa");
        String nName = nickNames.get("mikael");
        System.out.println(nName);

    }

}
