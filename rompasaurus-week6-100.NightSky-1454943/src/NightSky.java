import java.util.Random;
public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;
    public NightSky(double density) {
        this.density=density;
        this.width=20;
        this.height=10;
    }

    public NightSky(int width, int height) {
        this.density = 0.1;
        this.height=height;
        this.width=width;
    }

    public NightSky(double density, int width, int height) {
        this.height=height;
        this.width=width;
        this.density = density;
    }

    public void printLine() {
        Random random = new Random();
        //starsInLastPrint=0;
        for(int i =0;i<width;i++) {
            if (random.nextDouble() < density) {
                System.out.print("*");
                starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
       System.out.println();
    }

    public void print() {
        starsInLastPrint=0;
        for(int i =0;i<height;i++) {
            printLine();
        }
    }
    
    public int starsInLastPrint(){
        return this.starsInLastPrint;
    }
}