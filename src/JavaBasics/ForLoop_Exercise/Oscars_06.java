package ForLoop_Exercise;

import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String actor = scanner.nextLine();
        double startingScore = Double.parseDouble(scanner.nextLine());
        int judgeCount = Integer.parseInt(scanner.nextLine());
        double scoreTracker = 0;

        for (int i = 1; i <= judgeCount; i++) {
            String judgeName = scanner.nextLine();
            double judgeScore = Double.parseDouble(scanner.nextLine());

            startingScore += judgeScore*judgeName.length()/2;

        if (startingScore >= 1250.5) {
            break;
        }
        }
        if (scoreTracker + startingScore >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, startingScore);
        } else if (scoreTracker + startingScore < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actor, 1250.5-startingScore);
        }
    }
}
