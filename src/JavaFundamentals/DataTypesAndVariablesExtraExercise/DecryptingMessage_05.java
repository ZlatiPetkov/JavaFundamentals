package JavaFundamentals.DataTypesAndVariablesExtraExercise;

import java.util.Scanner;

public class DecryptingMessage_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String message = "";

        for (int i = 0; i < n; i++) {
        char input = scanner.nextLine().charAt(0);
        int asciiInput = input+key;
        message += (char) (asciiInput);
        }
        System.out.println(message);
    }
}
