import java.util.Random;

public class PasswordRandomizer {
    private String alphabet="qwertyuiopasdfghjklzxcvbnm";

    private Random randomizer;
    private int length;

    public PasswordRandomizer(int length) {
        this.length=length;
        randomizer = new Random();
    }

    public String createPassword() {
        String password="";
        int i=0;
        //int random;
        while (i<this.length) {

           // random=this.randomizer.nextInt(alphabet.length());
            password+=alphabet.charAt(this.randomizer.nextInt(alphabet.length()));
            i++;
        }
        return password;
    }
}
