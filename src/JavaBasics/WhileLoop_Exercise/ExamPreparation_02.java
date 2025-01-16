package JavaBasics.WhileLoop_Exercise;

import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int badGradesLimit = Integer.parseInt(scanner.nextLine());
        int sumGrades = 0;
        int gradesCount = 0;
        String lastProblem = "";
        int badGradesCount = 0;

        String command = scanner.nextLine();

        while (!command.equals("Enough")) {
            String taskName = command;
            int grade = Integer.parseInt(scanner.nextLine());
            lastProblem = taskName;

            if (grade <= 4) {
                badGradesCount++;

                if (badGradesCount >= badGradesLimit) {
                    break;
                }
            }

            gradesCount++;
            sumGrades += grade;
            command = scanner.nextLine();
        }
        if (badGradesCount >= badGradesLimit) {
            System.out.printf("You need a break, %d poor grades.", badGradesCount);
        } else {
            System.out.printf("Average score: %.2f%n" +
                    "Number of problems: %d%n" +
                    "Last problem: %s", 1.0 * sumGrades / gradesCount, gradesCount, lastProblem);
        }
    }
}
