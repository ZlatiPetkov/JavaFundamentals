package JavaFundamentals.DataTypesAndVariablesExtraExercise;

import java.util.Scanner;

public class BalancedBrackets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int countOfOpenBrackets = 0;
        int countOfClosingBrackets = 0;

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            if (input.equals("(")) {
                countOfOpenBrackets++;
            } else if (input.equals(")")) {
                countOfClosingBrackets++;
            }
            if (countOfOpenBrackets-countOfClosingBrackets>1 || countOfOpenBrackets<countOfClosingBrackets) {
                break;
            }
        }
        if (countOfOpenBrackets != countOfClosingBrackets) {
            System.out.println("UNBALANCED");
        } else {
            System.out.println("BALANCED");
        }
    }
}
