package JavaBasics.ComplexChecks_Exercise;

import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double cost = 0.0;
        String accomdation = null;
        String destination = null;

        if (budget <= 100) {
            switch (season) {
                case "summer" -> {
                    cost = 0.3 * budget;
                    accomdation = "Camp";
                    destination = "Bulgaria";
                }
                case "winter" -> {
                    cost = 0.7 * budget;
                    accomdation = "Hotel";
                    destination = "Bulgaria";
                }
            }
        } else if (budget <= 1000) {
            switch (season) {
                case "summer" -> {
                    cost = 0.4 * budget;
                    accomdation = "Camp";
                    destination = "Balkans";
                }
                case "winter" -> {
                    cost = 0.8 * budget;
                    accomdation = "Hotel";
                    destination = "Balkans";
                }
            }
        } else {
            cost = 0.9 * budget;
            accomdation = "Hotel";
            destination = "Europe";
        }
        System.out.println("Somewhere in "+destination);
        System.out.printf("%s - %.2f", accomdation, cost);
    }
}
