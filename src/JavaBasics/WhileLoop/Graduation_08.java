package JavaBasics.WhileLoop;

import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int startYear = 1;
        int failedCount = 0;
        double grade = 0.0;
        double sumGrades = 0.0;

        while (startYear <= 12) {
            if (failedCount > 1) {
                break;
            }
            double currentGrade = Double.parseDouble(scanner.nextLine());

            if (currentGrade >= 4) {
                grade++;
                sumGrades += currentGrade;
            } else {
                failedCount++;
                continue;
            }

            startYear++;
        }
        if (failedCount > 1) {
            System.out.printf("%s has been excluded at %d grade", name, startYear);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", name, sumGrades / 12);
        }
    }
}


