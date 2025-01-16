package JavaFundamentals.BasicSyntaxExercise;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0.0;

        for (int i = 1; i <= orders ; i++) {
            double capsulePrice = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());

            double orderPrice = capsulePrice*days*capsuleCount;
            totalPrice += orderPrice;
            System.out.printf("The price for the coffee is: $%.2f\n", orderPrice);
        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
