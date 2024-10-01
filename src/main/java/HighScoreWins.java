import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {

        Scanner skinny = new Scanner(System.in);
        System.out.print("Please enter a game score: ");
        String input = skinny.nextLine();

        String[] parts = input.split("\\|");
        String teams = parts[0]; // Home: Visitor
        String scores = parts[1]; // 21:9

        String[] teamNames = teams.split(":"); // ["Home", "Visitor"]
        String[] teamScores = scores.split(":"); // ["21", "9"]

        String team1 = teamNames[0];
        String team2 = teamNames[1];
        int score1 = Integer.parseInt(teamScores[0]);
        int score2 = Integer.parseInt(teamScores[1]);

        if (score1 > score2) {
            System.out.println("Winner: " + team1);
        } else if (score2 > score1) {
            System.out.print("Winner: " + team2);
        } else {
            System.out.println("It's a tie!");
        }


    }

}
