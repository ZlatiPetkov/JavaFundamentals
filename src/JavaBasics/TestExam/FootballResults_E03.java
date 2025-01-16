package JavaBasics.TestExam;

import java.util.Scanner;

public class FootballResults_E03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstMatch = scanner.nextLine();
        int homeGoals1 = Character.getNumericValue(firstMatch.charAt(0));
        int awayGoals1= Character.getNumericValue(firstMatch.charAt(2));

        String secondMatch = scanner.nextLine();
        int homeGoals2 = Character.getNumericValue(secondMatch.charAt(0));
        int awayGoals2= Character.getNumericValue(secondMatch.charAt(2));

        String thirdMatch = scanner.nextLine();
        int homeGoals3 = Character.getNumericValue(thirdMatch.charAt(0));
        int awayGoals3= Character.getNumericValue(thirdMatch.charAt(2));

        int homeWins = 0;
        int homeLoss = 0;
        int draws = 0;

        if (homeGoals1 > awayGoals1) {
            homeWins++;
        } else if (homeGoals1 < awayGoals1) {
            homeLoss++;
        } else {
            draws++;
        }

        if (homeGoals2 > awayGoals2) {
            homeWins++;
        } else if (homeGoals2 < awayGoals2) {
            homeLoss++;
        } else {
            draws++;
        }

        if (homeGoals3 > awayGoals3) {
            homeWins++;
        } else if (homeGoals3 < awayGoals3) {
            homeLoss++;
        } else {
            draws++;
        }
        System.out.printf("Team won %d games. \n" +
                "Team lost %d games. \n" +
                "Drawn games: %d.", homeWins, homeLoss, draws);
    }
}
