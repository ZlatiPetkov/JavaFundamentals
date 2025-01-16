package JavaBasics.Exam;

import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на входни данни
        int upperLimitFirstDigit = Integer.parseInt(scanner.nextLine());
        int upperLimitSecondDigit = Integer.parseInt(scanner.nextLine());
        int upperLimitThirdDigit = Integer.parseInt(scanner.nextLine());

        // Възможни прости числа за втората цифра
        int[] primeNumbers = {2, 3, 5, 7};

        // Генериране на PIN кодове
        for (int firstDigit = 2; firstDigit <= upperLimitFirstDigit; firstDigit += 2) { // Четни числа
            for (int secondDigit : primeNumbers) { // Прости числа
                if (secondDigit > upperLimitSecondDigit) break; // Проверка за горната граница
                for (int thirdDigit = 2; thirdDigit <= upperLimitThirdDigit; thirdDigit += 2) { // Четни числа
                    // Печат на валидния PIN код
                    System.out.printf("%d %d %d%n", firstDigit, secondDigit, thirdDigit);
                }
            }
        }
    }
}
