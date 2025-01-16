package JavaBasics.TestExam;

import java.util.Scanner;

public class TennisEqupiment_E01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double racketPrice = Double.parseDouble(scanner.nextLine());
        int racketCount = Integer.parseInt(scanner.nextLine());
        int shoesCount = Integer.parseInt(scanner.nextLine());
        double shoesPrice = 0.1666666667*racketPrice;
        double shoesAndRacketCost = shoesPrice*shoesCount + racketPrice*racketCount;
        double otherEquipment = 0.2 *  shoesAndRacketCost;
        double totalCost = shoesAndRacketCost + otherEquipment;

        System.out.printf("Price to be paid by Djokovic %.0f\n", Math.floor(totalCost/8));
        System.out.printf("Price to be paid by sponsors %.0f", Math.ceil(totalCost*7/8));

    }
}
