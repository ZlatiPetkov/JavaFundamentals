package JavaBasics.WhileLoop_Exercise;

import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int volume = width*height*length;
        int boxesCount = 0;

        while (volume-boxesCount > 0) {
            String command = scanner.nextLine();
                if (command.equals("Done")) {
                    break;
                }
                int newBoxes = Integer.parseInt(command);
                boxesCount += newBoxes;
                if (volume - boxesCount <= 0) {
                    break;
                }
        }
        if (volume-boxesCount <=0) {
            System.out.printf("No more free space! You need %d Cubic meters more.", boxesCount-volume);
        } else {
            System.out.printf("%d Cubic meters left.", volume-boxesCount);
        }
    }
}
