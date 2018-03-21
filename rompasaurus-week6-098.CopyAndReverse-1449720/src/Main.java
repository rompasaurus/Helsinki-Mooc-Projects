import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);
    
        // change the copied
        copied[0] = 99;
    
     int[] reverse = reverseCopy(original);

    // print both
    System.out.println( "original: " +Arrays.toString(original));
    System.out.println( "reversed: " +Arrays.toString(reverse));
        System.out.println( "original: " + Arrays.toString(original));
        System.out.println( "copied: " + Arrays.toString(copied));
    }
    public static int[] copy(int[] orig){
        int[] copy =new int[orig.length];
        for(int i =0;i<orig.length;i++){
            copy[i]=orig[i];
        }
        return copy;
    }
    public static int[] reverseCopy(int[] orig){
        int[] copy =new int[orig.length];
        for(int i =0;i<orig.length;i++){
            copy[orig.length-1-i]=orig[i];
        }
        return copy;
    }
}
