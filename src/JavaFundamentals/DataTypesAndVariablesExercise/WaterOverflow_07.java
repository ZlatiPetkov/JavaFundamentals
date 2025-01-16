package JavaFundamentals.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tankCapacity = 255;

        byte count = Byte.parseByte(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            short liters = Short.parseShort(scanner.nextLine());
            if (tankCapacity-liters < 0) {
                System.out.println("Insufficient capacity!");
            } else {
                tankCapacity -= liters;
            }
        }
        System.out.println(255 - tankCapacity);
    }
}
