package JavaBasics.Exam;

import java.util.Scanner;

public class CatDiet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double fat = 9;
        double protein = 4;
        double carbs = 4;

        double fatsPercent = Double.parseDouble(scanner.nextLine());
        double proteinPercent = Double.parseDouble(scanner.nextLine());
        double carbsPercent = Double.parseDouble(scanner.nextLine());
        double totalCalories = Double.parseDouble(scanner.nextLine());
        double waterPercent = Double.parseDouble(scanner.nextLine());

        double totalFats = ((fatsPercent/100)*totalCalories)/fat;
        double totalProtein = ((proteinPercent/100)*totalCalories)/protein;
        double totalCarbs = ((carbsPercent/100)*totalCalories)/carbs;

        double foodWeight = totalCarbs+totalFats+totalProtein;
        double CaloriesPerGram = totalCalories / foodWeight;

        double clearCaloriesPerGram = ((100-waterPercent))/100*CaloriesPerGram;

        System.out.printf("%.4f", clearCaloriesPerGram);
    }
}
