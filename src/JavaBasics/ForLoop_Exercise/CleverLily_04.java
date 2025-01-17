package JavaBasics.ForLoop_Exercise;

import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washerCost = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int birthdayMoney = 0;
        int moneyTracker = 0;
        int toysCount = 0;
        int totalMoney = 0;

        for (int i = 1; i <= age; i++) {

            if (i % 2 != 0) {
            toysCount += 1;
            } else {
            moneyTracker += 10;
            birthdayMoney += moneyTracker;

            birthdayMoney--;
            }
        }
        totalMoney = toysCount*toyPrice+birthdayMoney;

        if (totalMoney >= washerCost) {
            System.out.printf("Yes! %.2f", totalMoney - washerCost);
        } else {
            System.out.printf("No! %.2f", washerCost - totalMoney);
        }
    }
}
