package JavaBasics.ForLoop_Exercise;

import java.util.Scanner;

public class Histogram_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        for (int i = 1; i <=n ; i++) {
            int val = Integer.parseInt(scanner.nextLine());

         if (val < 200) {
             p1 += 1;
         } else if (val <= 399) {
             p2 += 1;
         } else if (val <= 599) {
             p3 += 1;
         } else if (val <= 799) {
             p4 += 1;
         } else {
             p5 += 1;
         }
        }
        System.out.printf("%.2f%% \n", p1/n*100);
        System.out.printf("%.2f%% \n", p2/n*100);
        System.out.printf("%.2f%% \n", p3/n*100);
        System.out.printf("%.2f%% \n", p4/n*100);
        System.out.printf("%.2f%% \n", p5/n*100);
    }
}
