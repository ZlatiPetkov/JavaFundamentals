package JavaFundamentals.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int totalSpices = 0;
        int daysPassed = 0;

        while (startingYield>=100) {
            totalSpices += startingYield -26;
            startingYield -= 10;
            daysPassed++;
        }

        if (daysPassed>0) {
            totalSpices-=26;
        }

        System.out.println(daysPassed);
        System.out.println(totalSpices);
    }
}
