package JavaBasics.WhileLoop;

import java.util.Scanner;

public class MinNumber_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int maxNumber = Integer.MAX_VALUE;

        while (!command.equals("Stop")) {

            int currentNumber = Integer.parseInt(command);

            if (currentNumber < maxNumber) {
                maxNumber = currentNumber;
            }

            command = scanner.nextLine();
        }
        System.out.println(maxNumber);
    }
}

