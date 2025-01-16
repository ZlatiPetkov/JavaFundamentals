package JavaBasics.NestedCycles_Exercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());


        for (int i = n1; i <= n2 ; i++) {
            String currentNum = "" + i;
            int sumEven = 0;
            int sumOdd = 0;
            for (int j = 0; j < currentNum.length(); j++) {
                int currentDigit = Integer.parseInt("" + currentNum.charAt(j));
                if (j % 2 == 0) {
                    sumEven += currentDigit;
                } else {
                    sumOdd += currentDigit;
                }
            }
            if (sumEven == sumOdd) {
                System.out.print(i + " ");
            }
        }
    }
}
