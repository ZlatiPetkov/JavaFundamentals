package JavaFundamentals.BasicSyntaxExercise;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        float headsetPrice = Float.parseFloat(scanner.nextLine());
        float mousePrice = Float.parseFloat(scanner.nextLine());
        float keyboardPrice = Float.parseFloat(scanner.nextLine());
        float displayPrice = Float.parseFloat(scanner.nextLine());

        int headsetReplacements = lostGames/2;
        int mouseReplacements = lostGames/3;
        int keyboardReplacements = lostGames/6;
        int displayReplacements = lostGames/12;

        float rageCosts = headsetPrice*headsetReplacements + mousePrice*mouseReplacements + keyboardPrice*keyboardReplacements + displayReplacements*displayPrice;

        System.out.printf("Rage expenses: %.2f lv.", rageCosts);

    }
}
