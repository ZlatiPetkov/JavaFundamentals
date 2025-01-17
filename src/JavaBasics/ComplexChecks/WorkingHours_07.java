package ComplexChecks;

import java.util.Scanner;

public class WorkingHours_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        switch (day) {
            case "Monday", "Tuesday", "Wednesday" , "Thursday" , "Friday" , "Saturday" -> {
                if (hours >= 10 && hours <=18) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");
                }
            }
            case "Sunday" -> {
                System.out.println("closed");
            }
        }
    }
}
