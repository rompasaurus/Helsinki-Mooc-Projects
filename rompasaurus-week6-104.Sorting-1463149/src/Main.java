import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
        
    }
    
    public static int smallest(int[] array){
        int currentMin=array[0];
        for(int a : array){
            if(a<currentMin){
                currentMin=a;
            }
        }
        return currentMin;
    }
    
    public static int indexOfTheSmallest(int[] array){
        int currentMin=array[0];
        int index=0;
        int minIndex=0;
        for(int a : array){
            if(a<currentMin){
                currentMin=a;
                minIndex=index;
            }
            index++;
            
        }
        return minIndex;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int currentMin=array[index];
        int minIndex=index;
        for(int i = index;i<array.length;i++){
            if(array[i]<currentMin){
                currentMin=array[i];
                minIndex=i;
            }
        }
        return minIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
    // code goes here
    int temp=array[index1];
    array[index1]=array[index2];
    array[index2]=temp;
    }
    
    public static void sort(int[] array) {
        System.out.println( Arrays.toString(array) );
        swap(array,indexOfTheSmallest(array),0);
        System.out.println( Arrays.toString(array) );
        for(int i = 1;i<array.length-1;i++){
            swap(array,i,indexOfTheSmallestStartingFrom(array,i));
            System.out.println(Arrays.toString(array) );
        }
    }
  
    
}
