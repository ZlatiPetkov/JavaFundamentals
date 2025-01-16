package JavaBasics.WhileLoop_Exercise;

import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int cakeSize = length * width;
        int piecesTaken = 0;
        int piecesCounter =0;

        while (cakeSize >= 0) {
            String command = scanner.nextLine();
                if (command.equals("STOP")) {
                    break;
                }
            piecesTaken = Integer.parseInt(command);
            piecesCounter += piecesTaken;
            cakeSize -= piecesTaken;
                if (cakeSize < 0) {
            break;
        }
    }
        if (length*width>=piecesCounter) {
            System.out.printf("%d pieces are left.", length*width-piecesCounter);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakeSize));
        }
}
}
