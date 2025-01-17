package ForLoop;

import java.util.Scanner;

public class OddEvenSum_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberCount = Integer.parseInt(scanner.nextLine());
        int sumOdd = 0;
        int sumEven =0;

        for (int i = 1; i <= numberCount; i++) {

            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                sumEven += currentNumber;
            } else {
                sumOdd += currentNumber;
            }
        }
        if (sumOdd == sumEven) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumOdd);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(sumOdd - sumEven));
        }
    }
}
