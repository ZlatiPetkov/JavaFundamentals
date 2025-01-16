package JavaBasics.Exam;

import java.util.Scanner;

public class Training {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на входни данни
        int n = Integer.parseInt(scanner.nextLine()); // Брой дни
        double initialKm = Double.parseDouble(scanner.nextLine()); // Километри за първия ден

        double totalKm = initialKm; // Общо пробягани километри

        for (int i = 0; i < n; i++) {
            int percentIncrease = Integer.parseInt(scanner.nextLine()); // Процент на увеличение
            initialKm += initialKm * (percentIncrease / 100.0); // Увеличаване на нормата
            totalKm += initialKm; // Добавяне към общите километри
        }

        // Проверка на резултата
        if (totalKm >= 1000) {
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(totalKm - 1000));
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000 - totalKm));
        }
    }
}
