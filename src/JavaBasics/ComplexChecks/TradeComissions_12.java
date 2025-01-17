package ComplexChecks;

import java.util.Scanner;

public class TradeComissions_12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double salesVolume = Double.parseDouble(scanner.nextLine());
        double comission = 0;
        boolean isValid = true;

        if (salesVolume >= 0 && salesVolume <= 500) {
            switch (city) {
                case "Sofia" -> comission = salesVolume * 0.05;
                case "Varna" -> comission = salesVolume * 0.045;
                case "Plovdiv" -> comission = salesVolume * 0.055;
                default -> isValid = false ;
            }
        } else if (salesVolume > 500 && salesVolume <= 1000) {
            switch (city) {
                case "Sofia" -> comission = salesVolume * 0.07;
                case "Varna" -> comission = salesVolume * 0.075;
                case "Plovdiv" -> comission = salesVolume * 0.08;
                default -> isValid = false ;

            }
        } else if (salesVolume > 1000 && salesVolume <= 10000) {
            switch (city) {
                case "Sofia" -> comission = salesVolume * 0.08;
                case "Varna" -> comission = salesVolume * 0.1;
                case "Plovdiv" -> comission = salesVolume * 0.12;
                default -> isValid = false ;

            }
        } else if (salesVolume > 10000) {
            switch (city) {
                case "Sofia" -> comission = salesVolume * 0.12;
                case "Varna" -> comission = salesVolume * 0.13;
                case "Plovdiv" -> comission = salesVolume * 0.145;
                default -> isValid = false ;
            }
        } else {
            isValid = false ;
        }
        if (isValid) {
            System.out.printf("%.2f",comission);
        } else {
            System.out.println("error");
        }
    }
}
