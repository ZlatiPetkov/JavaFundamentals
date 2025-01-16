package JavaBasics.NestedCycles_Exercise;

import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int trainers = Integer.parseInt(scanner.nextLine());
        double gradesSum = 0;
        double gradesCount = 0;
        double averageGrade = 0;
        double endGrade = 0;
        String presentation = "";
        int presentationCounter = 0;

        while(true) {
             presentation = scanner.nextLine();
                 if (presentation.equals("Finish"))
                     break;
            for (int j = 0; j < trainers; j++) {
                double grade = Double.parseDouble(scanner.nextLine());
                gradesSum += grade;
                gradesCount++;
            }
            averageGrade = gradesSum / gradesCount;
            gradesSum = 0;
            gradesCount = 0;
            endGrade += averageGrade;
            presentationCounter ++;
            System.out.printf("%s - %.2f.\n", presentation, averageGrade);

        }
        System.out.printf("Student's final assessment is %.2f.",endGrade/presentationCounter);
    }
}
