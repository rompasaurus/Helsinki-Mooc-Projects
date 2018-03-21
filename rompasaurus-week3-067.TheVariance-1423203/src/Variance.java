import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum = sum + number;
        }
        return sum;
    }


    public static double average(ArrayList<Integer> list) {
        // write code here
        // forst the sum of variables is calculated and saved in double variable
        double sum = (double) sum(list);
        // average is then easy to get with dividing sum by the list length
        return sum / list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        double average = average(list);
        double variance=0;
        //ArrayList<Double> vary = new ArrayList<>();
        for (double num : list) {

            variance+=Math.pow(num-average,2);
        }
        return variance/(list.size()-1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
