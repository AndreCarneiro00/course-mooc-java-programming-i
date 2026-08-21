import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        List<Match> matches = parseCSV(file);

        System.out.println("Team:");
        String selectedTeam = scan.nextLine();

        int numberOfGames = 0;
        int wins = 0;
        int losses = 0;
        for (Match match : matches) {
            if (!match.getVisitingTeam().equals(selectedTeam) && !match.getHomeTeam().equals(selectedTeam)) {
                continue;
            }

            if (
                match.getVisitingTeam().equals(selectedTeam) && match.getVisitingTeamPoints() > match.getHomeTeamPoints() || 
                (match.getHomeTeam().equals(selectedTeam) && match.getVisitingTeamPoints() < match.getHomeTeamPoints())
            ) {
                wins += 1;
            }
            else {
                losses += 1;
            }

            numberOfGames += 1;
        }

        System.out.println("Games: " + numberOfGames);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        


    }

    private static List<Match> parseCSV(String file) {
        List<Match> matches = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String [] matchData = fileScanner.nextLine().split(",");
                matches.add(new Match(
                    matchData[0], matchData[1], Integer.valueOf(matchData[2]), Integer.valueOf(matchData[3])
                ));
            }
        } catch (Exception e) {
            System.out.println("");
        }

        return matches;
    }

}
