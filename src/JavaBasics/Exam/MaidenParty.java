package JavaBasics.Exam;

import java.util.Scanner;

public class MaidenParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double loveMessage = 0.60;
        double waxRose = 7.20;
        double keyring = 3.60;
        double caricature = 18.20;
        double luckyCharm = 22.00;

        double maidenPartyCost = Double.parseDouble(scanner.nextLine());
        int countLoveMessages = Integer.parseInt(scanner.nextLine());
        int countWaxRoses = Integer.parseInt(scanner.nextLine());
        int countKeyrings = Integer.parseInt(scanner.nextLine());
        int countCaricatures = Integer.parseInt(scanner.nextLine());
        int countLuckyCharms = Integer.parseInt(scanner.nextLine());
        int totalCountItems = countCaricatures+countKeyrings+countLoveMessages+countWaxRoses+countLuckyCharms;

        double totalSales = loveMessage*countLoveMessages + waxRose*countWaxRoses + keyring*countKeyrings + caricature*countCaricatures + luckyCharm*countLuckyCharms;

        if (totalCountItems>25) {
            totalSales -= totalSales*0.35;
        }

        double hostingCosts = 0.1 * totalSales;
        double wins = totalSales-hostingCosts;

        if (wins>maidenPartyCost) {
            System.out.printf("Yes! %.2f lv left.", wins-maidenPartyCost);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", maidenPartyCost-wins);
        }
    }
}
