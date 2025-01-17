package JavaBasics.SimpleChecks_Exercise;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double excursionCost = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int teddyBearCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());

        double puzzlePrice = 2.60;
        double dollPrice = 3.00;
        double teddyBearPrice = 4.10;
        double minionsPrice = 8.20;
        double truckPrice = 2.00;

        int toysCount = puzzleCount + dollsCount + teddyBearCount + minionsCount + trucksCount;
        double totalIncome = puzzlePrice*puzzleCount + dollPrice*dollsCount+ teddyBearCount*teddyBearPrice + minionsPrice*minionsCount + truckPrice*trucksCount;

        if (toysCount >= 50) {
            totalIncome = totalIncome - 0.25 * totalIncome;
        }

        double rentCost = totalIncome * 0.1;
        double finalIncome = totalIncome - rentCost;
        double remainingMoney = finalIncome - excursionCost;

        if (remainingMoney>=0) {
            System.out.printf("Yes! %.2f lv left.", remainingMoney);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(remainingMoney));
        }

    }
}
