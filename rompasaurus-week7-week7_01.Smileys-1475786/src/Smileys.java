
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {
        int smileLength = characterString.length()/2 +characterString.length()%2+3;
        printSmiles(smileLength);
        System.out.println();
        printSmiles(1);
        System.out.print(" "+characterString+" ");
        if (characterString.length() % 2 == 1) {
            System.out.print(" ");
        }
        printSmiles(1);
        System.out.println();
        printSmiles(smileLength);
        System.out.println();

    }
    private static void printSmiles(int numberOfSmiles) {
        for (int i = 0; i < numberOfSmiles; i++) {
            System.out.print(":)");
        }

    }

}
