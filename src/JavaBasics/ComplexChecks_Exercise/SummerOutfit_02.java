package JavaBasics.ComplexChecks_Exercise;

import java.util.Scanner;

public class SummerOutfit_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();
        String shoes = null;
        String clothes = null;

        if ((degrees >= 10) && (degrees <= 18)) {
            switch (timeOfDay) {
                case "Morning":
                    shoes = "Sneakers";
                    clothes = "Sweatshirt";
                    break;
                case "Afternoon":
                case "Evening":
                    shoes = "Moccasins";
                    clothes = "Shirt";
                    break;
            }
        } else if ((degrees > 18) && (degrees <= 24)) {
            switch (timeOfDay) {
                case "Morning":
                case "Evening":
                    shoes = "Moccasins";
                    clothes = "Shirt";
                    break;
                case "Afternoon":
                    shoes = "Sandals";
                    clothes = "T-Shirt";
                    break;
            }
        } else { // This case handles degrees above 24
            switch (timeOfDay) {
                case "Morning":
                    shoes = "Sandals";
                    clothes = "T-Shirt";
                    break;
                case "Afternoon":
                    shoes = "Barefoot";
                    clothes = "Swim Suit";
                    break;
                case "Evening":
                    shoes = "Moccasins";
                    clothes = "Shirt";
                    break;
            }
        }
            System.out.printf("It's %d degrees, get your %s and %s.", degrees, clothes, shoes);
    }
}