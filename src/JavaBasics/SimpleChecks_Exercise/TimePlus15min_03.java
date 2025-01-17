package SimpleChecks_Exercise;

import java.util.Scanner;

public class TimePlus15min_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int mins = Integer.parseInt(scanner.nextLine());

        mins = mins + 15;

        if (mins >= 60) {
            mins = mins - 60;
            hours = hours + 1;
        }

        if (hours >= 24) {
            hours = 0;
        }
            System.out.printf("%d:%02d", hours, mins);
        }
    }

