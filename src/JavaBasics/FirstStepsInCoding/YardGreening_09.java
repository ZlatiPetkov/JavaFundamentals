package FirstStepsInCoding;
import java.util.Scanner;

public class YardGreening_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double yardGreeningCost = 7.61;
        double discount = 0.18;

        double yardSize = Double.parseDouble(scanner.nextLine());

        double initialCost = yardSize*yardGreeningCost;
        double discountAmount = initialCost * discount;
        double finalPrice = initialCost - discountAmount;

        System.out.println("The final price is: " + finalPrice);
        System.out.println("The discount is: " + discountAmount);

    }

}
