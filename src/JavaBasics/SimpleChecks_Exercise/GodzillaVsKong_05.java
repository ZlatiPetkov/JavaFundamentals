package SimpleChecks_Exercise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double movieBudget = Double.parseDouble(scanner.nextLine());
        int staticsCount = Integer.parseInt(scanner.nextLine());
        double costumePrice = Double.parseDouble(scanner.nextLine());
        double decorPrice = 0.1 * movieBudget;

        double totalCostumePrice = staticsCount * costumePrice;

        if (staticsCount > 150) {
            totalCostumePrice = 0.9 *totalCostumePrice;
        }

        if (totalCostumePrice+decorPrice > movieBudget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(totalCostumePrice + decorPrice - movieBudget));
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", Math.abs(totalCostumePrice + decorPrice - movieBudget));
        }
    }
}
