package ForLoop_Exercise;

import java.util.Scanner;

public class Salary_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tabCount = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());
        int fine = 0;

        for (int i = 1; i <= tabCount ; i++) {
            String tabName = scanner.nextLine();

            switch (tabName) {
                case "Facebook" -> fine += 150;
                case "Instagram" -> fine += 100;
                case "Reddit" -> fine += 50;
            }
        }
        if (salary - fine <= 0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.printf("%.0f",salary-fine);
        }
    }
}
