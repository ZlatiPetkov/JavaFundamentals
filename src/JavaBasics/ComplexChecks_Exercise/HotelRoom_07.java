package JavaBasics.ComplexChecks_Exercise;

import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int period = Integer.parseInt(scanner.nextLine());
        double totalPriceStudio = 0.0;
        double totalPriceApp = 0.0;

        if ("May".equals(month) || "October".equals(month)) {
            if (period <= 7) {
                totalPriceStudio = period * 50;
                totalPriceApp = period * 65;
            } else if (period <=14) {
                totalPriceStudio = 0.95 *period * 50;
                totalPriceApp = period * 65;
            } else {
                totalPriceStudio = 0.7 *(period * 50);
                totalPriceApp = 0.9*(period * 65);
            }
        } else if ("June".equals(month) || "September".equals(month)) {
            if (period <=14) {
                totalPriceStudio = period * 75.20 ;
                totalPriceApp=  period * 68.70;
            } else {
                totalPriceStudio = 0.8*(period*75.20);
                totalPriceApp = 0.9 * (period*68.70);
            }
        } else {
            if (period <= 14) {
                totalPriceStudio = period * 76;
                totalPriceApp = period * 77;
            } else {
                totalPriceStudio = period * 76;
                totalPriceApp = 0.9 * (period * 77);
            }
        }
        System.out.printf("Apartment: %.2f lv.\n", totalPriceApp);
        System.out.printf("Studio: %.2f lv.", totalPriceStudio);
    }
}
