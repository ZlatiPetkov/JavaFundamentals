package JavaBasics.NestedCycles_Exercise;

import java.util.Scanner;

public class SumPrimeAndNonPrime_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int primeNum = 0;
        int nonPrimeNum = 0;

        while (true) {
            String command = scanner.nextLine();

            // Break the loop if the user enters "stop"
            if (command.equals("stop")) {
                break;
            }

            int inputNum = Integer.parseInt(command);

            // Ignore negative numbers as they cannot be prime
            if (inputNum < 0) {
                System.out.println("Number is negative.");
                continue;
            }

            // Check if the number is prime using a nested loop
            boolean isPrime = true;
            if (inputNum <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i < inputNum; i++) {
                    if (inputNum % i == 0) {
                        isPrime = false;
                        break; // Exit the loop if a divisor is found
                    }
                }
            }

            // Add the number to the appropriate sum
            if (isPrime) {
                primeNum += inputNum;
            } else {
                nonPrimeNum += inputNum;
            }
        }

        // Print the results
        System.out.printf("Sum of all prime numbers is: %d%n", primeNum);
        System.out.printf("Sum of all non prime numbers is: %d%n", nonPrimeNum);
    }
}
