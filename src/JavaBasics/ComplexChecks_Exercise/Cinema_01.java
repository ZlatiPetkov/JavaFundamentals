package JavaBasics.ComplexChecks_Exercise;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        double income = 0;

        switch (projection) {
            case "Premiere" -> income = rows * cols * 12;
            case "Normal" -> income = rows * cols * 7.50;
            case "Discount" -> income = rows * cols * 5;
        }
        System.out.printf("%.2f leva", income);
    }
}
