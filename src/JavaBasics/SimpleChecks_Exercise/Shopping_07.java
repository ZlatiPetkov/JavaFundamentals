package JavaBasics.SimpleChecks_Exercise;

import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int vgaCount = Integer.parseInt(scanner.nextLine());
        int cpuCount = Integer.parseInt(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());

        int vgaPrice = 250;
        double cpuPrice = 0.35 * vgaCount * vgaPrice;
        double ramPrice = 0.1 * vgaCount * vgaPrice;
        double totalPrice = vgaCount * vgaPrice + cpuCount * cpuPrice + ramCount * ramPrice;

        if (vgaCount > cpuCount) {
            totalPrice = totalPrice - totalPrice * 0.15;
        }

        if (totalPrice <= budget) {
            System.out.printf("You have %.2f leva left!", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(budget - totalPrice));
        }
    }
}
