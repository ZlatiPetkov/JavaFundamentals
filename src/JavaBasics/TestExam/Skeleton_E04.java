package JavaBasics.TestExam;

import java.util.Scanner;

public class Skeleton_E04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int targetMin = Integer.parseInt(scanner.nextLine());
        int targetSec = Integer.parseInt(scanner.nextLine());
        double trackLength = Double.parseDouble(scanner.nextLine());
        int time = Integer.parseInt(scanner.nextLine());

        int targetInSec = targetMin*60+targetSec;
        double totalTimeReduction = trackLength/120*2.5;
        double totalTime = (trackLength/100*time)-totalTimeReduction;

        if (targetInSec >= totalTime) {
            System.out.printf("Marin Bangiev won an Olympic quota!\n" +
                    "His time is %.3f.", totalTime);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", totalTime - targetInSec);
        }
    }
}
