package JavaFundamentals.DataTypesAndVariablesExtraExercise;

import java.util.Scanner;

public class FloatingEquality_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        float eps = 0.000001f;
        double diff = Math.abs(a - b);

        if (diff < eps) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
