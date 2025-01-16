package JavaFundamentals.BasicSyntaxLab;

import java.util.Scanner;

public class SumOfOddNumbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int counter = 1;
        int i = 1;

        while (counter <=n) {
            System.out.println(i);
            sum+=i;
            i+=2;
            counter++;
        }
        System.out.printf("Sum: %d", sum);
    }
}
