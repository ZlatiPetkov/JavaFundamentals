package SimpleChecks_Exercise;

import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeForMeter = Double.parseDouble(scanner.nextLine());
        double swimTime = distance * timeForMeter + (Math.floor(distance / 15) * 12.5);

        if (worldRecord <= swimTime) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(worldRecord - swimTime));
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", swimTime);
        }
    }
}
