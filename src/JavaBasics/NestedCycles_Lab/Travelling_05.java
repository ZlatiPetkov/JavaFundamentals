package JavaBasics.NestedCycles_Lab;

import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String destination = scanner.nextLine();
            if (destination.equals("End")) {
                break;
            }
            double budget = Double.parseDouble(scanner.nextLine());
            double totalSaved = 0;

            while (totalSaved < budget) {
                double savedSum = Double.parseDouble(scanner.nextLine());
                totalSaved += savedSum;
                if (totalSaved >= budget) {
                    System.out.printf("Going to %s!\n", destination);
                }

            }
        }
    }
}
