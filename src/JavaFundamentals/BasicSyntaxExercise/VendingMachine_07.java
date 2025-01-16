package JavaFundamentals.BasicSyntaxExercise;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = "";
        double sum = 0.0;

        while(!userInput.equals("Start")) {
          String coins = scanner.nextLine();
            if (coins.equals("Start")) {
                break;
            }
            Double coinsProcessed = Double.parseDouble(coins);
            if (coinsProcessed == 0.1 || coinsProcessed == 0.2 || coinsProcessed == 0.5 || coinsProcessed == 1 || coinsProcessed == 2) {
                sum += coinsProcessed;
            } else {
                System.out.printf("Cannot accept %.2f\n", coinsProcessed);
            }
        }
        while(!userInput.equals("End")) {
            userInput = scanner.nextLine();
            if (userInput.equals("End")) {
                break;
            }
            if (userInput.equals("Coke")) {
                if (sum-1 < 0) {
                    System.out.println("Sorry, not enough money");
                    continue;                }
                sum -= 1;
                System.out.println("Purchased Coke");
            } else if (userInput.equals("Nuts")) {
                if (sum-2 < 0) {
                    System.out.println("Sorry, not enough money");
                    continue;
                }
                sum -= 2;
                System.out.println("Purchased Nuts");
            } else if (userInput.equals("Water")) {
                if (sum-0.7 < 0) {
                    System.out.println("Sorry, not enough money");
                    continue;
                }
                sum -= 0.7;
                System.out.println("Purchased Water");
            } else if (userInput.equals("Crisps")) {
                if (sum-1.5 < 0) {
                    System.out.println("Sorry, not enough money");
                    continue;
                }
                sum -= 1.5;
                System.out.println("Purchased Crisps");
            } else if (userInput.equals("Soda")) {
                if (sum-0.8 < 0) {
                    System.out.println("Sorry, not enough money");
                    continue;
                }
                sum -= 0.8;
                System.out.println("Purchased Soda");
            } else {
                System.out.println("Invalid product");
            }
        }
        if (sum < 0) {
            System.out.println("Sorry, not enough money");
            System.out.printf("Change: %.2f" , sum);
        } else {
            System.out.printf("Change: %.2f" , sum);
        }
    }
}
