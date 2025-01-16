package JavaBasics.TestExam;

import java.util.Scanner;

public class GameNumberWars_E07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerOne = scanner.nextLine();
        String playerTwo = scanner.nextLine();
        String commandPlayerOne = "";
        String commandPlayerTwo = "";
        int resultPlayerOne = 0;
        int resultPlayerTwo = 0;
        boolean isNumberWars = false;


        while (true) {
            commandPlayerOne = scanner.nextLine();
            if (commandPlayerOne.equals("End of game")) {
                break;
            }
            commandPlayerTwo = scanner.nextLine();
            if (commandPlayerTwo.equals("End of game")) {
                break;
            }

            int numberPlayerOne = Integer.parseInt(commandPlayerOne);
            int numberPlayerTwo = Integer.parseInt(commandPlayerTwo);

            if (numberPlayerOne > numberPlayerTwo) {
                resultPlayerOne += numberPlayerOne - numberPlayerTwo;
            } else if (numberPlayerTwo > numberPlayerOne) {
                resultPlayerTwo += numberPlayerTwo - numberPlayerOne;
            } else {
                System.out.println("Number wars!");
                isNumberWars = true;

                commandPlayerOne = scanner.nextLine();
                commandPlayerTwo = scanner.nextLine();

                numberPlayerOne = Integer.parseInt(commandPlayerOne);
                numberPlayerTwo = Integer.parseInt(commandPlayerTwo);

                if (numberPlayerOne > numberPlayerTwo) {
                    System.out.printf("%s is winner with %d points", playerOne, resultPlayerOne);
                } else {
                    System.out.printf("%s is winner with %d points", playerTwo, resultPlayerTwo);
                }
                break;
            }
        }
        if (!isNumberWars) {
            System.out.printf("%s has %d points\n" +
                    "%s has %d points\n", playerOne, resultPlayerOne, playerTwo, resultPlayerTwo);
        }
    }
}
