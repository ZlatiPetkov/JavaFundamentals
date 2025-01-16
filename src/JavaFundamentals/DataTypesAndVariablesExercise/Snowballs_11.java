package JavaFundamentals.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ballsCount = Integer.parseInt(scanner.nextLine());
        double lastSnowBallValue = Double.MIN_VALUE;
        int lastSnowballSnow = 0;
        int lastSnowballTime = 0;
        int lastSnowballQuality = 0;

        for (int i = 0; i < ballsCount; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((double) snowballSnow / snowballTime, snowballQuality);
            if (snowballValue > lastSnowBallValue) {
                lastSnowBallValue = snowballValue;
                lastSnowballSnow = snowballSnow;
                lastSnowballTime = snowballTime;
                lastSnowballQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", lastSnowballSnow,lastSnowballTime,lastSnowBallValue,lastSnowballQuality);
    }
}
