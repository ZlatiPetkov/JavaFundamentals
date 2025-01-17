package JavaBasics.FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class SuppliesForSchool_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double penPrice = 5.80;
        double markerPrice = 7.20;
        double solventPrice = 1.20;

        int penCount = Integer.parseInt(scanner.nextLine());
        int markerCount = Integer.parseInt(scanner.nextLine());
        int solventAmount = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double totalPenPrice = penPrice * penCount;
        double totalMarkerPrice = markerPrice * markerCount;
        double totalSolventAmount = solventPrice * solventAmount;
        double finalSum = totalMarkerPrice + totalPenPrice + totalSolventAmount;
        double discountSum = finalSum * discount/100;
        double finalDiscountedSum = finalSum-discountSum;

        System.out.println(finalDiscountedSum);

    }
}
