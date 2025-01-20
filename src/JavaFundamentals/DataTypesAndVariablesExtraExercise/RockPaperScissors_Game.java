package JavaFundamentals.DataTypesAndVariablesExtraExercise;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String ROCK = "Rock";
        final String PAPER = "Paper";
        final String SCISSORS = "Scissors";

        System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");
        String playerMove = scanner.nextLine();
        if (playerMove.equals("r") || playerMove.equalsIgnoreCase("rock")) {
            playerMove = ROCK;
        } else if (playerMove.equals("p") || playerMove.equalsIgnoreCase("paper")) {
            playerMove = PAPER;
        } else if (playerMove.equals("s") || playerMove.equalsIgnoreCase("scissors")) {
            playerMove = SCISSORS;
        } else {
            System.out.println("Invalid input. Try again...");
            return;
        }

        Random random = new Random();
        int computerRandomNumber = random.nextInt(3); // 0, 1, or 2
        String computerMove = "";

        switch (computerRandomNumber) {
            case 0:
                computerMove = ROCK;
                break;
            case 1:
                computerMove = PAPER;
                break;
            case 2:
                computerMove = SCISSORS;
                break;
        }

        System.out.printf("The computer chose %s.%n", computerMove);

        if (playerMove.equals(computerMove)) {
            System.out.println("It's a tie!");
        } else if ((playerMove.equals(ROCK) && computerMove.equals(SCISSORS)) ||
                (playerMove.equals(PAPER) && computerMove.equals(ROCK)) ||
                (playerMove.equals(SCISSORS) && computerMove.equals(PAPER))) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }
}
