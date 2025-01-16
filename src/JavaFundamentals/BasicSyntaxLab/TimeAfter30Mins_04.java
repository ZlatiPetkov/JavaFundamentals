package JavaFundamentals.BasicSyntaxLab;

import java.util.Scanner;

public class TimeAfter30Mins_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int mins = Integer.parseInt(scanner.nextLine());

        int hoursConverted = hours * 60;

        int time = hoursConverted+mins+30;

        int finalHours = time/60;
        int finalMinutes = time - finalHours*60;
        if (finalHours >= 24) {
            finalHours = finalHours - 24;
        }
        System.out.printf("%d:%02d", finalHours,finalMinutes);
    }
}
