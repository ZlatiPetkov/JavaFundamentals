package JavaBasics.Exam;

import java.util.Scanner;

public class FinalCompetition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dancersCount = Integer.parseInt(scanner.nextLine());
        double pointsCount = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String location = scanner.nextLine();
        double totalScore = 0;
        double expenses = 0;

        switch (season) {
            case "summer" -> {
                if (location.equals("Bulgaria")){
                    totalScore = dancersCount*pointsCount;
                    expenses = 0.05*totalScore;
                    totalScore -= expenses;
                } else if (location.equals("Abroad")) {
                    totalScore = (dancersCount*pointsCount) + 0.5*(dancersCount*pointsCount);
                    expenses = 0.1*totalScore;
                    totalScore -= expenses;
                }
            }
            case "winter" -> {
                if (location.equals("Bulgaria")){
                    totalScore = dancersCount*pointsCount;
                    expenses = 0.08*totalScore;
                    totalScore -= expenses;
                } else if (location.equals("Abroad")) {
                    totalScore = (dancersCount*pointsCount) + 0.5*(dancersCount*pointsCount);
                    expenses = 0.15*totalScore;
                    totalScore -= expenses;
                }
            }
        }
        double charity = 0.75 *totalScore;

        System.out.printf("Charity - %.2f\n", charity);
        System.out.printf("Money per dancer - %.2f", (totalScore-charity)/dancersCount);
    }
}
