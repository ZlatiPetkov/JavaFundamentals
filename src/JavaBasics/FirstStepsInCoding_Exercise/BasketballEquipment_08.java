package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tuitionFee = Integer.parseInt(scanner.nextLine());

        double shoes = 0.6*tuitionFee;
        double suit = 0.8*shoes;
        double ball = 0.25*suit;
        double accessories = 0.2*ball;

        double trainingCost = tuitionFee+shoes+suit+ball+accessories;

        System.out.println(trainingCost);
    }
}
