import java.util.ArrayList;

public class Grades {
    private int grade;
    private int distribution;

    public Grades(int grade){
        this.grade = grade;
        calcDistribution();
    }

    public void calcDistribution(){
        if (grade <0 ){
            distribution=-1;
        } else if (grade < 30) {
            distribution=0;
        } else if (grade < 35) {
            distribution=1;
        } else if (grade < 40) {
            distribution=2;
        } else if (grade < 45) {
            distribution=3;
        } else if (grade < 50) {
            distribution=4;
        } else if (grade > 60) {
            distribution = -1;
        } else {
            distribution = 5;
        }
    }

    public boolean validScore(){
        return distribution>=0;
    }

    public boolean accepted(){
        return distribution>0;
    }

    public int getGrade(){
        return grade;
    }
    public int getDistribution(){
        return distribution;
    }
}
