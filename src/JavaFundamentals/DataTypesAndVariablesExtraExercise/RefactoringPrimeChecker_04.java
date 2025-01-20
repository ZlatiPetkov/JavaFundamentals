package JavaFundamentals.DataTypesAndVariablesExtraExercise;

import java.util.Scanner;

public class RefactoringPrimeChecker_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= number; i++) {
            boolean isTrue = true;
            for (int div = 2; div < i; div++) {
                if (i % div == 0) {
                    isTrue = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, isTrue);
        }

    }
}
