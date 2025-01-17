package JavaBasics.ForLoop;

import java.util.Scanner;

public class NumberSequence_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 1; i <=n; i++) {

            int currentNumber = Integer.parseInt(scanner.nextLine());

            if(currentNumber <= minNumber){
                minNumber = currentNumber;
            }

            if (currentNumber >= maxNumber){
                maxNumber = currentNumber;
            }
        }
        System.out.printf("Max number: %d%n", maxNumber);
        System.out.printf("Min number: %d%n", minNumber);
        }
    }

