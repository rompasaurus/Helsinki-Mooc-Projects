import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type exam scores, -1 completes:");
        int score =0;
        int accepted=0;
        int rejected=0;

        ArrayList<Grades> scores= new ArrayList<Grades>();
        while(score!=-1){
            score = Integer.parseInt(reader.nextLine());
            Grades grade = new Grades(score);
            int dist = grade.getDistribution();
            if(grade.validScore()){
                scores.add(grade);
            }
            if(grade.accepted()){
                accepted++;
            }else if(grade.getDistribution()!=-1){
                rejected++;
            }
        }
        System.out.println("Grade Distribution");
        printDistribution(scores);
        //System.out.println("accepted: "+accepted);
        //System.out.println("rejected: "+rejected);
        if(accepted+rejected==0){
            rejected++;
        }
        double acceptance= 100*accepted/(accepted+rejected);
        System.out.println("Acceptance percentage: "+acceptance);
        //System.out.println(acceptance);
    }
    public static double average(ArrayList<Grades> grades){
        double average=0;
        for(Grades grade:grades){
            average+=grade.getGrade();
        }
        return (average/grades.size())/60*100;
    }

    public static void printDistribution(ArrayList<Grades> grades){
        double average=0;
        int[] distribution = new int[]{0,0,0,0,0,0};
        for(Grades grade:grades){
            distribution[grade.getDistribution()]++;
        }
        //System.out.println(distribution[0]);
        for(int i=0;i<distribution.length;i++){
            System.out.print(i+": ");
            for(int j=0;j<distribution[i];j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }



}
