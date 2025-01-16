package JavaFundamentals.BasicSyntaxLab;

import java.util.Scanner;

public class RefactorSumOfOddNumbers_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        int counter = 1;
        int i = 1;

        while (counter <=n) {
            System.out.println(i);
            sum+=i;
            i+=2;
            counter++;
        }

        System.out.printf("Sum: %d%n", sum);
    }
}
