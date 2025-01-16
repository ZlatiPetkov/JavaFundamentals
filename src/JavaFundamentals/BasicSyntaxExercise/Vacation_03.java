package JavaFundamentals.BasicSyntaxExercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0.0;

        switch (groupType) {
           case "Students" -> {
               if (day.equals("Friday") && people < 30) {
                   price = people*8.45;
               } else if (day.equals("Friday") && people >= 30) {
                   price = people*8.45*0.85;
               } else if (day.equals("Saturday") && people < 30) {
                   price = people*9.80;
               } else if (day.equals("Saturday") && people >=30) {
                   price = people*9.80*0.85;
               } else if (day.equals("Sunday") && people < 30) {
                   price = people*10.46;
               } else if (day.equals("Sunday") && people >=30) {
                   price = people*10.46*0.85;
               }
            }
            case "Business" -> {
                if (day.equals("Friday") && people < 100) {
                    price = people*10.90;
                } else if (day.equals("Friday") && people >= 100) {
                    price = (people-10)*10.90;
                } else if (day.equals("Saturday") && people < 100) {
                    price = people*15.60;
                } else if (day.equals("Saturday") && people >=100) {
                    price = (people-10)*15.60;
                } else if (day.equals("Sunday") && people < 100) {
                    price = people*16;
                } else if (day.equals("Sunday") && people >=100) {
                    price = (people-10)*16;
                }
            }
            case "Regular" -> {
                if (day.equals("Friday") && (people < 10 || people > 20)) {
                    price = people*15;
                } else if (day.equals("Friday") && (people >= 10 || people <=20)) {
                    price = people*15*0.95;
                } else if (day.equals("Saturday") && (people < 10 || people > 20)) {
                    price = people*20;
                } else if (day.equals("Saturday") && (people >= 10 || people <=20)) {
                    price = people*20*0.95;
                } else if (day.equals("Sunday") && (people < 10 || people > 20)) {
                    price = people*22.50;
                } else if (day.equals("Sunday") && (people >= 10 || people <=20)) {
                    price = people*22.50*0.95;
                }
            }
        }
        System.out.printf("Total price: %.2f", price);
    }
}
