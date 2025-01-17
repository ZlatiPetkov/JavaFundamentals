package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        double totalVolume = length * width * height * 0.001;
        double equipmentVolume = totalVolume * percentage/100;
        double usableVolume = totalVolume - equipmentVolume;

        System.out.println(usableVolume);
    }
}
