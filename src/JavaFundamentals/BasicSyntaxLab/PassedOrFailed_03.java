package JavaFundamentals.BasicSyntaxLab;

import java.util.Scanner;

public class PassedOrFailed_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float number = Float.parseFloat(scanner.nextLine());

        if (number >= 3.00) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }
    }
}
