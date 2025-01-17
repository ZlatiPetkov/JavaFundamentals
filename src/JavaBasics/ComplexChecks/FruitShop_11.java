package JavaBasics.ComplexChecks;

import java.util.Scanner;

public class FruitShop_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double totalPrice = 0;
        boolean isValid = true;

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            switch (fruit) {
                case "banana" -> totalPrice = quantity * 2.5;
                case "apple" -> totalPrice = quantity * 1.20;
                case "orange" -> totalPrice = quantity * 0.85;
                case "grapefruit" -> totalPrice = quantity * 1.45;
                case "kiwi" -> totalPrice = quantity * 2.70;
                case "pineapple" -> totalPrice = quantity * 5.50;
                case "grapes" -> totalPrice = quantity * 3.85;
                default -> isValid = false;

            }
        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            switch (fruit) {
                case "banana" -> totalPrice = quantity * 2.70;
                case "apple" -> totalPrice = quantity * 1.25;
                case "orange" -> totalPrice = quantity * 0.90;
                case "grapefruit" -> totalPrice = quantity * 1.60;
                case "kiwi" -> totalPrice = quantity * 3;
                case "pineapple" -> totalPrice = quantity * 5.60;
                case "grapes" -> totalPrice = quantity * 4.20;
                default -> isValid = false;
            }
            } else {
                isValid = false;
        }
        if (isValid) {
            System.out.printf("%.2f",totalPrice);
        } else {
            System.out.println("error");
        }
    }
}

