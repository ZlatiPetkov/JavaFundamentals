package JavaFundamentals.BasicSyntaxExtraExercise;

import java.util.Scanner;


public class ReverseString_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        for (int i = text.length() - 1; i >= 0 ; i--) {
            System.out.print(text.charAt(i));
        }
    }
}
