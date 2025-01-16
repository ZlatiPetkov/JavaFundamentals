package JavaFundamentals.DataTypesAndVariablesLab;

import java.util.Scanner;

public class RefactorVolumeOfPyramid_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Length: ");
        double length = 0;
        length = Double.parseDouble(scanner.nextLine());

        System.out.print("Width: ");

        double  width = 0;
        width = Double.parseDouble(scanner.nextLine());

        System.out.print("Height: ");
        double height = 0;
        height = Double.parseDouble(scanner.nextLine());

        double volume = (length * width * height) / 3;

        System.out.printf("Pyramid Volume: %.2f", volume);
    }
}
