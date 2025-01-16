package JavaFundamentals.BasicSyntaxLab;

import java.util.Scanner;

public class ForeignLanguages_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();

        switch (country) {
            case "USA", "England" -> System.out.println("English");
            case "Spain", "Argentina", "Mexico" -> System.out.println("Spanish");
            default -> System.out.println("unknown");
        }
    }
}
