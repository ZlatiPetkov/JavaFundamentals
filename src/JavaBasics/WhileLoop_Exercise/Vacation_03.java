package JavaBasics.WhileLoop_Exercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double vacationMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        String action = "";
        int counterSpend = 0;
        int totalCounter = 0;

        while (availableMoney < vacationMoney && counterSpend <5) {

            action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

            switch (action) {
                case "spend" -> {
                    availableMoney -= money;
                    if (availableMoney < 0) {
                        availableMoney =0;
                    }
                    counterSpend++;
                }
                case "save" -> {
                    availableMoney += money;
                    counterSpend = 0;
                }
            }
            totalCounter++;
        }
        if (counterSpend >=5) {
            System.out.printf("You can't save the money. \n" +
                    "%d", totalCounter);
        } else if (availableMoney >= vacationMoney) {
            System.out.printf("You saved the money for %d days.", totalCounter);
        }
    }
}
