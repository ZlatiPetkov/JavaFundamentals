package JavaFundamentals.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int fullCourse = people/capacity;

        if (people%capacity > 0) {
            fullCourse++;
        }
        System.out.println(fullCourse);
    }
}
