
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class NhlStatisticsPart2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("NHL statistics service");
        String name;
        while (true) {
            System.out.println("");
            System.out.print("command (points, goals, assists, penalties, player, club, quit): ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("points")) {
                NHLStatistics.sortByPoints();
                NHLStatistics.top(10);
            } else if (command.equals("goals")) {
                NHLStatistics.sortByGoals();
                NHLStatistics.top(10);
            } else if (command.equals("assists")) {
                NHLStatistics.sortByAssists();
                NHLStatistics.top(10);
            } else if (command.equals("penalties")) {
                NHLStatistics.sortByPenalties();
                NHLStatistics.top(10);
            } else if (command.equals("player")) {
                System.out.println("input player name");
                name = reader.nextLine();
                System.out.println("Statistics for "+name);
                NHLStatistics.searchByPlayer(name); 
            } else if (command.equals("club")) {
                System.out.println("input club abbreviation ");
                name = reader.nextLine();
                NHLStatistics.sortByPoints();
                NHLStatistics.teamStatistics(name);
                
                // Note: When printing statistics they should be ordered by points (so the players with the most points come first).
            }

        }
    }
}
