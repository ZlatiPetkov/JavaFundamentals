package WhileLoop;

import java.util.Scanner;

public class SumNumbers_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int finalNumber = Integer.parseInt(scanner.nextLine());
        int newNumber = 0;

        while (newNumber < finalNumber) {
            newNumber += Integer.parseInt(scanner.nextLine());

        }
        System.out.println(newNumber);
    }
}
