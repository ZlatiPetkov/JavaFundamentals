package FirstStepsInCoding;
import java.util.Scanner;


public class RectangleArea_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sideA = Integer.parseInt(scanner.nextLine());
        int sideB = Integer.parseInt(scanner.nextLine());

        int area;

        area = sideA * sideB;

        System.out.println(area);

    }
}
