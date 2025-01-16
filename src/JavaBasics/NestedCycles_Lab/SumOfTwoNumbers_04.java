package JavaBasics.NestedCycles_Lab;

import java.util.Scanner;

public class SumOfTwoNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int lastNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int combCounter = 0;

        for (int i = firstNumber; i <= lastNumber; i++) {
            for (int j = firstNumber; j <= lastNumber; j++) {
                combCounter++;
                if (magicNumber == i + j) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", combCounter, i, j, magicNumber);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d", combCounter, magicNumber);
    }
}
