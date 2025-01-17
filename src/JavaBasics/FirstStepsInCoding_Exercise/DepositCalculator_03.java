package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double depositAmount = Double.parseDouble(scanner.nextLine());
        int depositDuration = Integer.parseInt(scanner.nextLine());
        double interest = Double.parseDouble(scanner.nextLine())/100;


        double finalAmount = depositAmount + depositDuration * ((depositAmount * interest)/12);

        System.out.println(finalAmount);
    }
}
