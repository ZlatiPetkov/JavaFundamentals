package JavaFundamentals.DataTypesAndVariablesLab;

import java.util.Scanner;

public class SpecialNumbers_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number ; i++) {
            int specialNumber = i;
            int digitSum = 0;
            while (specialNumber>0) {
                int digit = specialNumber%10;
                digitSum += digit;
                specialNumber /= 10;
            }
            if (digitSum ==5 || digitSum == 7 || digitSum ==11) {
                System.out.printf("%d -> True\n", i);
            } else {
                System.out.printf("%d -> False\n", i);
            }
        }
    }
}
