package JavaBasics.TestExam;

import java.util.Scanner;

public class WorldSnookerChampionship_E06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String round = scanner.nextLine();
        String ticket = scanner.nextLine();
        int ticketCount = Integer.parseInt(scanner.nextLine());
        String tropheyPhoto = scanner.nextLine();
        double ticketPrice = 0.0;
        double totalCost = 0.0;
        double totalCostFinal = 0.0;

        switch (round) {
            case "Quarter final" -> {
                switch (ticket) {
                    case "Standard" -> ticketPrice = 55.50;
                    case "Premium" -> ticketPrice = 105.20;
                    case "VIP" -> ticketPrice = 118.90;
                }
            }
            case "Semi final" -> {
                switch (ticket) {
                    case "Standard" -> ticketPrice = 75.88;
                    case "Premium" -> ticketPrice = 125.22;
                    case "VIP" -> ticketPrice = 300.40;
                }
            }
            case "Final" -> {
                switch (ticket) {
                    case "Standard" -> ticketPrice = 110.10;
                    case "Premium" -> ticketPrice = 160.66;
                    case "VIP" -> ticketPrice = 400;
                }
            }
        }
        totalCost += ticketPrice*ticketCount;

        if (totalCost <= 2500) {
            totalCostFinal = totalCost;
        } else if (totalCost <= 4000) {
            totalCostFinal = totalCost*0.9;
        } else {
           totalCostFinal = totalCost*0.75;
        }

       if (tropheyPhoto.equals("Y") && totalCost <=4000)    {
           totalCostFinal += 40*ticketCount;
       }
        System.out.printf("%.2f", totalCostFinal);
    }
}
