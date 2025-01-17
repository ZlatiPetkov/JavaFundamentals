package FirstStepsInCoding;
import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double dogFood = 2.50;
        double catFood = 4.00;

        int dogFoodCount = Integer.parseInt(scanner.nextLine());
        int catFoodCount = Integer.parseInt(scanner.nextLine());

        double foodCost = (dogFood*dogFoodCount) + (catFood*catFoodCount);

        System.out.println(foodCost);


    }
}
