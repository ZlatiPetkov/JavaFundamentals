package ForLoop_Exercise;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double groupsCount = Integer.parseInt(scanner.nextLine());
        double trekkersMusala = 0;
        double trekkersMontblanc = 0;
        double trekkersKilimanjaro = 0;
        double trekkersK2 = 0;
        double trekkersEverest = 0;
        double trekkersTotal = 0;

        for (int i =1; i <= groupsCount ; i++) {

            int trekkersCount = Integer.parseInt(scanner.nextLine());

            if (trekkersCount <=5) {
                trekkersMusala += trekkersCount;
            } else if (trekkersCount <= 12) {
                trekkersMontblanc += trekkersCount;
            } else if (trekkersCount <=25) {
                trekkersKilimanjaro += trekkersCount;
            } else if (trekkersCount <=40) {
                trekkersK2 += trekkersCount;
            } else {
                trekkersEverest += trekkersCount;
            }
        }
        trekkersTotal = trekkersMusala + trekkersMontblanc + trekkersKilimanjaro + trekkersK2 + trekkersEverest;

        System.out.printf("%.2f%% \n", trekkersMusala/trekkersTotal*100);
        System.out.printf("%.2f%% \n", trekkersMontblanc/trekkersTotal*100);
        System.out.printf("%.2f%% \n", trekkersKilimanjaro/trekkersTotal*100);
        System.out.printf("%.2f%% \n", trekkersK2/trekkersTotal*100);
        System.out.printf("%.2f%% \n", trekkersEverest/trekkersTotal*100);
    }
}
