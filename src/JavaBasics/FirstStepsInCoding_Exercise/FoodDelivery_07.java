package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double chickenMenuPrice = 10.35;
        double fishMenuPrice = 12.40;
        double veggieMenuPrice = 8.15;

        double chickenMenuCount = Double.parseDouble(scanner.nextLine());
        double fishMenuCount = Double.parseDouble(scanner.nextLine());
        double veggieMenuCount = Double.parseDouble(scanner.nextLine());

        double deliveryCost = 2.5;
        double mainOrderCost = chickenMenuCount*chickenMenuPrice + fishMenuPrice*fishMenuCount + veggieMenuCount*veggieMenuPrice;
        double dessertCost = mainOrderCost*0.2;

        double orderCost = mainOrderCost + dessertCost + deliveryCost;

        System.out.println(orderCost);
    }
}
