package JavaBasics.ComplexChecks_Exercise;

import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0.0;

        switch (flowerType) {
            case "Roses" -> {
                if (flowerCount > 80) {
                    totalPrice = flowerCount * 5 * 0.9;
                } else {
                    totalPrice = flowerCount * 5;
                }
            }
            case "Dahlias" -> {
                if (flowerCount > 90) {
                    totalPrice = flowerCount * 3.80 * 0.85;
                } else {
                    totalPrice = flowerCount * 3.80;
                }
            }
            case "Tulips" -> {
                if (flowerCount > 80) {
                    totalPrice = flowerCount * 2.80 * 0.85;
                } else {
                    totalPrice = flowerCount * 2.80;
                }
            }
            case "Narcissus" -> {
                if (flowerCount < 120) {
                    totalPrice = flowerCount * 3 * 1.15;
                } else {
                    totalPrice = flowerCount * 3 ;
                }
            }
            case "Gladiolus" -> {
                if (flowerCount < 80) {
                    totalPrice = flowerCount * 2.5 * 1.2;
                } else {
                    totalPrice = flowerCount * 2.5;
                }
            }
        }
        if (totalPrice > budget) {
            System.out.printf("Not enough money, you need %.2f leva more.", totalPrice-budget);
        } else {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, budget-totalPrice);
        }
    }
}
