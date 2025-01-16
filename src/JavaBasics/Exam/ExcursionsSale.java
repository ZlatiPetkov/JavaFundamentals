package JavaBasics.Exam;

import java.util.Scanner;

public class ExcursionsSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seaPackages = Integer.parseInt(scanner.nextLine());
        int mountainPackages = Integer.parseInt(scanner.nextLine());

        int seaPrice = 680;
        int mountainPrice = 499;

        int totalProfit = 0;

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("Stop")) {
                break;
            }

            if (command.equals("sea") && seaPackages > 0) {
                totalProfit += seaPrice;
                seaPackages--;
            } else if (command.equals("mountain") && mountainPackages > 0) {
                totalProfit += mountainPrice;
                mountainPackages--;
            }


            if (seaPackages == 0 && mountainPackages == 0) {
                System.out.println("Good job! Everything is sold.");
                break;
            }
        }


        System.out.printf("Profit: %d leva.%n", totalProfit);
    }
}
