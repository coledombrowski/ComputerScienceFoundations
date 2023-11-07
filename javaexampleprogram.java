import java.util.Scanner;

public class BowlingScoreCalculator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input your name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Input scores for 1st, 2nd, and 3rd games
        System.out.print("Enter the score for the 1st game: ");
        int score1 = scanner.nextInt();
        System.out.print("Enter the score for the 2nd game: ");
        int score2 = scanner.nextInt();
        System.out.print("Enter the score for the 3rd game: ");
        int score3 = scanner.nextInt();

        // Calculate average, lowest, and highest scores
        int sum = score1 + score2 + score3;
        int average = sum / 3;
        int lowest = Math.min(Math.min(score1, score2), score3);
        int highest = Math.max(Math.max(score1, score2), score3);

        // Output the information
        System.out.println("\nName: " + name);
        System.out.println("1st Game Score: " + score1);
        System.out.println("2nd Game Score: " + score2);
        System.out.println("3rd Game Score: " + score3);
        System.out.println("Average Score: " + average);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("Highest Score: " + highest);
    }
}
