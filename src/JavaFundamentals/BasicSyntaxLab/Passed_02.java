package JavaFundamentals.BasicSyntaxLab;

import java.util.Scanner;

public class Passed_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float number = Float.parseFloat(scanner.nextLine());

        if (number >= 3.00) {
            System.out.println("Passed!");
        }
    }
}
