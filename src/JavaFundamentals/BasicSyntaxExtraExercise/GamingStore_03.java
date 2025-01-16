package JavaFundamentals.BasicSyntaxExtraExercise;

import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float balance = Float.parseFloat(scanner.nextLine());
        double totalCost = 0;

        while (balance > 0) {
            String game = scanner.nextLine();
            if (game.equals("Game Time")) {
                break;
            }

            double gamesCost = switch (game) {
                case "OutFall 4", "RoverWatch Origins Edition" -> 39.99;
                case "CS: OG" -> 15.99;
                case "Zplinter Zell" -> 19.99;
                case "Honored 2" -> 59.99;
                case "RoverWatch" -> 29.99;
                default -> -1;
            };

            if (gamesCost == -1) {
                System.out.println("Not Found");
            } else if (gamesCost - balance > 0.0001) {
                System.out.println("Too Expensive");
            } else {
                System.out.printf("Bought %s\n", game);
                balance -= gamesCost;
                totalCost += gamesCost;
            }
        }

        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalCost, Math.abs(balance));
    }
}
