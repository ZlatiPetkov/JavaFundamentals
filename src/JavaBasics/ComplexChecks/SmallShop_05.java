package JavaBasics.ComplexChecks;

import java.util.Scanner;

public class SmallShop_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());
        double totalPrice = 0;


        switch (product) {
            case "coffee" -> {
                switch (city) {
                    case "Sofia" ->  totalPrice = count * 0.5;
                    case "Plovdiv" -> totalPrice = count * 0.4;
                    case "Varna" -> totalPrice = count * 0.45;
                }
            }
            case "water" -> {
                switch (city) {
                    case "Sofia" -> totalPrice = count * 0.8;
                    case "Plovdiv","Varna" -> totalPrice= count*0.7;
                }
            }
            case "beer" -> {
                switch (city) {
                    case "Sofia" -> totalPrice = count * 1.20;
                    case "Plovdiv" -> totalPrice = count * 1.15;
                    case "Varna" -> totalPrice = count * 1.10;
                }
            }
            case "sweets" -> {
                switch (city) {
                    case "Sofia"-> totalPrice = count*1.45;
                    case "Plovdiv" -> totalPrice = count*1.30;
                    case "Varna" -> totalPrice = count*1.35;
                }
            }
            case "peanuts" -> {
                switch (city) {
                    case "Sofia" -> totalPrice = count * 1.60;
                    case "Plovdiv" -> totalPrice = count * 1.50;
                    case "Varna" -> totalPrice = count * 1.55;
                }
            }
        }
        System.out.println(totalPrice);
    }
}
