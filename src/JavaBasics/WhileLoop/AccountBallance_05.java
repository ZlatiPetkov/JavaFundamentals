package WhileLoop;

import java.util.Scanner;

public class AccountBallance_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double sum = 0.0;
        String endCommand = "NoMoreMoney";

        while (!command.equals(endCommand)) {
            double installment = Double.parseDouble(command);

            if (installment <0) {
                System.out.println("Invalid operation!");
                break;
            } else {
                sum += installment;
                System.out.printf("Increase: %.2f \n", installment);
            }
            command = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", sum);
    }
}
