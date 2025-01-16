package JavaFundamentals.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte numberOfKegs = Byte.parseByte(scanner.nextLine());
        String finalModel = "";
        float initialVolume = 0.0f;

        for (int i = 0; i < numberOfKegs; i++) {
            String model = scanner.nextLine();
            float radius = Float.parseFloat(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            float volume = (float) (Math.PI * radius*radius*height);
            if (volume > initialVolume) {
                initialVolume = volume;
                finalModel = model;
            }
        }
        System.out.println(finalModel);
    }
}
