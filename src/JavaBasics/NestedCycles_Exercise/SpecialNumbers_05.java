package JavaBasics.NestedCycles_Exercise;

import java.util.Scanner;

public class SpecialNumbers_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <=9999 ; i++) {
            boolean isSpecial = true;

            int currentNumber = i;
            while (currentNumber>0) {
                int digit = currentNumber % 10;
                currentNumber /= 10;

                if (digit == 0 || N % digit != 0) {
                    isSpecial = false;
                    break;
                }
                }
            if (isSpecial) {
                System.out.println(i +" ");
            }
        }
    }
}
