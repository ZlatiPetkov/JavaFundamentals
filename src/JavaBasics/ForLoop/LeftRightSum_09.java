package ForLoop;

import java.util.Scanner;

public class LeftRightSum_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberCountInGroup = Integer.parseInt(scanner.nextLine());
        int sumLeft= 0;
        int sumRight=0;

        for (int i = 1; i <= numberCountInGroup *2 ; i++) {

            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (i <= numberCountInGroup) {
                sumLeft += currentNumber;
            } else {
                sumRight += currentNumber;
            }
        }
        if (sumLeft == sumRight) {
            System.out.printf("Yes, sum = %d", sumLeft);
        } else {
            System.out.printf(" No, diff = %d", Math.abs(sumLeft-sumRight));
        }
    }
}
