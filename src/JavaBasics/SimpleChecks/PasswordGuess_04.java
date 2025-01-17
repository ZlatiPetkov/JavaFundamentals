package SimpleChecks;

import java.util.Scanner;

public class PasswordGuess_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputPw = scanner.nextLine();
        String password = "s3cr3t!P@ssw0rd";

        if (inputPw.equals(password)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
