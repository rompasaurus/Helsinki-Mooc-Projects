import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        System.out.println("Top 25 players based on penalty amounts");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        System.out.println("Statistics for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby"); 
        
        System.out.println("Statistics for Sidney Crosby");
        NHLStatistics.teamStatistics("PHI");         
    
        System.out.println("Players in Anaheim Ducks ordered by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");

        

    }
}