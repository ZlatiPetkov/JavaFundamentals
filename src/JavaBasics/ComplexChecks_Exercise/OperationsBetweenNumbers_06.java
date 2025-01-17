package ComplexChecks_Exercise;

import java.util.Scanner;

public class OperationsBetweenNumbers_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n1 = Double.parseDouble(scanner.nextLine());
        double n2 = Double.parseDouble(scanner.nextLine());
        String opr = scanner.nextLine();
        double output = 0.0;
        String oddEven = null;

        switch (opr) {
            case "+":{
                if ((n1+n2)%2 == 0) {
                    oddEven = "even";
                    output = n1+n2;
                } else if ((n1+n2)%2 != 0) {
                    oddEven = "odd";
                    output = n1+n2;
                }
                break;
            }
            case "-":{
                if ((n1-n2)%2 == 0) {
                    oddEven = "even";
                    output = n1-n2;
                } else if ((n1-n2)%2 != 0) {
                    oddEven = "odd";
                    output = n1-n2;
                }
                break;
            }
            case "*":{
                if ((n1*n2)%2 == 0) {
                    oddEven = "even";
                    output = n1*n2;
                } else if ((n1*n2)%2 != 0) {
                    oddEven = "odd";
                    output = n1*n2;
                }
                break;
            }
            case "/":{
                    output =  n1 / n2;
                }
                break;
            case "%":{
                if (n2 !=0) {
                    output =  n1 % n2;
                }
            }
                break;
        }
        if ("+".equals(opr) || "-".equals(opr) || "*".equals(opr)) {
            System.out.printf("%.0f %s %.0f = %.0f - %s", n1, opr, n2, output, oddEven);
        } else if ("/".equals(opr)  && n2 != 0) {
            System.out.printf("%.0f %s %.0f = %.2f", n1, opr, n2, output);
        } else if ( "%".equals(opr) && n2 != 0) {
            System.out.printf("%.0f %s %.0f = %.0f", n1, opr, n2, output);
        } else if (n2 == 0 && ("/".equals(opr) || "%".equals(opr))) {
            System.out.printf("Cannot divide %.0f by zero", n1);
        }
    }
}
