package ComplexChecks_Exercise;

import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String Season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());
        double price = 0.0;
        boolean isValid = true;
        double finalPrice = 0.0;


        if ("Spring".equals(Season)) {
            if (fishermen <= 6) {
                price = 3000 * 0.9;
            } else if (fishermen <= 11) {
                price = 3000 * 0.85;
            } else if (fishermen >12) {
                price = 3000 * 0.75;
            }
        } else if ("Summer".equals(Season) || "Autumn".equals(Season)) {
            if (fishermen <= 6) {
                price = 4200 * 0.9;
            } else if (fishermen <= 11) {
                price = 4200 * 0.85;
            } else if (fishermen >12) {
                price = 4200 * 0.75;
            }
        }  else if ("Winter".equals(Season)) {
            if (fishermen <= 6) {
                price = 2600 * 0.9;
            } else if (fishermen <= 11) {
                price = 2600 * 0.85;
            } else if (fishermen > 12) {
                price = 2600 * 0.75;
            }
        }
        if (fishermen % 2 == 0 && ("Winter".equals(Season) || "Spring".equals(Season) || "Summer".equals(Season))) {
           finalPrice = price * 0.95;
        } else {
            finalPrice = price;
        }
       if (finalPrice > budget) {
           System.out.printf("Not enough money! You need %.2f leva.", finalPrice-budget);
       } else  {
           System.out.printf("Yes! You have %.2f leva left.", budget-finalPrice);
       }
    }
}
