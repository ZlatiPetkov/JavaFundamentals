package JavaFundamentals.DataTypesAndVariablesLab;

import java.util.Scanner;

public class PoundsToDollars_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float gbp = Float.parseFloat(scanner.nextLine());
        float rate = 1.36f;
        float usd = gbp *rate;
        System.out.printf("%.3f", usd);
    }
}
