package JavaBasics.ComplexChecks;

import java.util.Scanner;

public class CinemaTicket_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();

        switch (day) {
            case "Monday", "Tuesday", "Friday" -> System.out.println("12");
            case "Wednesday", "Thursday" -> System.out.println("14");
            case "Saturday", "Sunday" -> System.out.println("16");
        }
    }
}
