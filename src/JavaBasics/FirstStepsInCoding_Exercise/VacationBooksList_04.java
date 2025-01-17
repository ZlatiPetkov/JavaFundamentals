package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class VacationBooksList_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int bookPagesCount = Integer.parseInt(scanner.nextLine());
        int pagesReadPerHr = Integer.parseInt(scanner.nextLine());
        int daysCount = Integer.parseInt(scanner.nextLine());

        int bookReadTime = bookPagesCount/pagesReadPerHr;
        int requiredHrDaily = bookReadTime/daysCount;

        System.out.println(requiredHrDaily);

    }
}
