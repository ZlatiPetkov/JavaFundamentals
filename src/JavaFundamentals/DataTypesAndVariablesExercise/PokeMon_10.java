package JavaFundamentals.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int originalPower = pokePower;
        int pokeDistance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int pokes = 0;

        while (pokePower>=pokeDistance) {
            pokePower -= pokeDistance;
            pokes++;

            if (pokePower == originalPower/2 && exhaustionFactor > 0) {
                pokePower /= exhaustionFactor;
            }

        }
        System.out.println(pokePower);
        System.out.println(pokes);
    }
}
