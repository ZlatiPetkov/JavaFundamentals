package JavaBasics.TestExam;

import java.util.Scanner;

public class BasketballEquipment_E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int trainingPrice = Integer.parseInt(scanner.nextLine());
        double shoesPrice = 0.6*trainingPrice;
        double suitPrice = 0.8*shoesPrice;
        double ballPrice = 0.25*suitPrice;
        double accessoriesPrice = 0.2*ballPrice;
        double totalPrice = trainingPrice+shoesPrice+suitPrice+ballPrice+accessoriesPrice;

        System.out.printf("%.2f", totalPrice);

    }
}
