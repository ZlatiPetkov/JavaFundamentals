package JavaBasics.ForLoop_Exercise;

import java.util.Scanner;

public class TennisRanks_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int toursCount = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());
        int wins = 0;
        int currentPoints = 0;

        for (int i = 1; i <= toursCount ; i++) {
            String tourResult = scanner.nextLine();

            switch (tourResult) {
                case "W" -> {
                    currentPoints += 2000;
                    wins += 1;
                }
                case "F" -> currentPoints += 1200;
                case "SF" -> currentPoints += 720;
            }
        }
        System.out.printf("Final points: %d \n", startingPoints+currentPoints);
        System.out.printf("Average points: %d \n", currentPoints/toursCount);
        System.out.printf("%.2f%%", 1.0 * wins / toursCount * 100);
    }
}
