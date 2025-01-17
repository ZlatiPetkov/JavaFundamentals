package SimpleChecks_Exercise;

import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        int seriesDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());
        double lunchTime = 0.125 * breakDuration;
        double relaxTime = 0.25 * breakDuration;
        double movieAvailTime = breakDuration - lunchTime - relaxTime;

        if (seriesDuration <= movieAvailTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", seriesName, Math.ceil(breakDuration-lunchTime-relaxTime-seriesDuration));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", seriesName, Math.ceil(seriesDuration-movieAvailTime));
        }
    }
}
