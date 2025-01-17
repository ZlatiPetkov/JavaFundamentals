package JavaBasics.SimpleChecks;

import java.util.Scanner;

public class AreaOfFigures_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String figType = scanner.nextLine();

        if (figType.equals("square")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", sideA * sideA);
        } else if (figType.equals("rectangle")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());;
            System.out.printf("%.3f", sideA*sideB);
        } else if (figType.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", radius * radius * Math.PI);
        } else {
            double sideA = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", sideA*height/2);
        }
    }
}
