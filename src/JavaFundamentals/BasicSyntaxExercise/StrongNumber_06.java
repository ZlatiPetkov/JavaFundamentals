package JavaFundamentals.BasicSyntaxExercise;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int originalNumber = number;
        int sumOfFactorial = 0;


        while (number > 0) {
            int digitFactorial = 1;
            int digit = number % 10;
            for (int i = 2; i <= digit ; i++) {
                 digitFactorial *= i;
            }
            sumOfFactorial += digitFactorial;
            number = number / 10;
        }
        if (sumOfFactorial == originalNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}