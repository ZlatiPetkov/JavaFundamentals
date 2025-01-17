package JavaBasics.WhileLoop;

import java.util.Scanner;

public class MaxNumber_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int maxNumber = Integer.MIN_VALUE;

        while (!command.equals("Stop")) {

           int currentNumber = Integer.parseInt(command);

           if (currentNumber > maxNumber) {
               maxNumber = currentNumber;
           }

            command = scanner.nextLine();
        }
        System.out.println(maxNumber);
    }
}
