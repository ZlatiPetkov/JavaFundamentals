package JavaFundamentals.DataTypesAndVariablesExtraExercise;

import java.util.Scanner;

public class FromLeftToRight_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            Long firstNumber = Long.parseLong(parts[0]);
            Long secondNumber = Long.parseLong(parts[1]);

            long largerNumber = Math.max(firstNumber,secondNumber);
            largerNumber = Math.abs(largerNumber);

            long sumLargerNumber = 0;
            while (largerNumber > 0) {
                sumLargerNumber += largerNumber % 10;
                largerNumber /= 10;
            }
            System.out.println(sumLargerNumber);
        }
    }
}

