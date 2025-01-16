package JavaBasics.NestedCycles_Exercise;

import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        int freeSeats = 0;
        int studentTickets = 0;
        int totalStudentTickets = 0;
        int standardTickets = 0;
        int totalStandardTickets = 0;
        int kidTickets = 0;
        int totalKidTickets = 0;
        int totalTickets = 0;


        while(!movieName.equals("Finish")) {
         String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            } else {
                freeSeats = Integer.parseInt(input);
                for (int i = 1; i <= freeSeats; i++) {
                    String ticketType = scanner.nextLine();
                    if (ticketType.equals("student")) {
                        studentTickets++;
                    } else if (ticketType.equals("standard")) {
                        standardTickets++;
                    } else if (ticketType.equals("kid")){
                        kidTickets++;
                    } else {
                        break;
                    }
                }
                System.out.printf("%s - %.2f%% full.\n", movieName, 1.0*(kidTickets+standardTickets+studentTickets)/freeSeats*100);
                totalTickets += kidTickets+standardTickets+studentTickets;
                totalKidTickets += kidTickets;
                kidTickets=0;
                totalStudentTickets += studentTickets;
                studentTickets=0;
                totalStandardTickets += standardTickets;
                standardTickets=0;
            }
            movieName = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d\n", totalTickets);
        System.out.printf("%.2f%% student tickets.\n", 1.0*totalStudentTickets/totalTickets*100);
        System.out.printf("%.2f%% standard tickets.\n", 1.0*totalStandardTickets/totalTickets*100);
        System.out.printf("%.2f%% kids tickets.\n", 1.0*totalKidTickets/totalTickets*100);
    }
}
