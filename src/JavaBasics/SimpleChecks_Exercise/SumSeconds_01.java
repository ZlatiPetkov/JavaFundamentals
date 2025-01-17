package JavaBasics.SimpleChecks_Exercise;

import java.util.Scanner;

public class SumSeconds_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());

        int totalTime = timeFirst + timeSecond + timeThird;
        int totalTimeMin = totalTime / 60;
        int totalTimeSec = totalTime % 60;

        if (totalTimeSec < 10) {
            System.out.printf("%d:0%d", totalTimeMin, totalTimeSec);
        } else {
            System.out.printf("%d:%d", totalTimeMin, totalTimeSec);
        }

    }
}
