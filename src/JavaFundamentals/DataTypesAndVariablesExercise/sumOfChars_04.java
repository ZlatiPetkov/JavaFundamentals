package JavaFundamentals.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class sumOfChars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            char symbol = scanner.nextLine().charAt(0);
            sum += (int) (symbol);
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
