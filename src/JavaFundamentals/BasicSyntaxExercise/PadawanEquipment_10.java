package JavaFundamentals.BasicSyntaxExercise;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float budget = Float.parseFloat(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        float lightsabrePrice = Float.parseFloat(scanner.nextLine());
        float robePrice = Float.parseFloat(scanner.nextLine());
        float beltPrice = Float.parseFloat(scanner.nextLine());

        int lightsabreCount = (int) Math.ceil(students*1.1);
        int freeBelts = students/6;
        int beltsCount = students - freeBelts;

        float budgetNeeded = lightsabrePrice*lightsabreCount + robePrice*students + beltPrice*beltsCount;

        if (budget >= budgetNeeded) {
            System.out.printf("The money is enough - it would cost %.2flv.", budgetNeeded);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", budgetNeeded-budget);
        }
    }
}
