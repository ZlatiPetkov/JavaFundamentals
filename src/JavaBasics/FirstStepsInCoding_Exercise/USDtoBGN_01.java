package JavaBasics.FirstStepsInCoding_Exercise;
import java.util.Scanner;


public class USDtoBGN_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double conversionRate = 1.79549;
        double usdAmount = Double.parseDouble(scanner.nextLine());
        double bgnAmount = usdAmount * conversionRate;

        System.out.println(bgnAmount);
    }
}
