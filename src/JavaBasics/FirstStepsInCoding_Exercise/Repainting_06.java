package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double protectiveNylon = 1.50;
        double paint = 14.50;
        double thinner = 5.0;
        double bag = 0.4;
        double backupPaint = 1.1;
        int backupNylon = 2;

        int nylonAmount = Integer.parseInt(scanner.nextLine());
        int paintAmount = Integer.parseInt(scanner.nextLine());
        int thinnerAmount = Integer.parseInt(scanner.nextLine());
        int workHours = Integer.parseInt(scanner.nextLine());

        double nylonCost = (nylonAmount+backupNylon)*protectiveNylon;
        double paintCost = paint * backupPaint * paintAmount;
        double thinnerCost = thinnerAmount*thinner;

        double materialCost = nylonCost + paintCost + thinnerCost + bag;
        double manCost = (materialCost * 0.3) * workHours;
        double finalCost = manCost + materialCost;

        System.out.println(finalCost);
    }
}
