package JavaFundamentals.BasicSyntaxExercise;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user = scanner.nextLine();
        String expectedPassword = "";

        for (int i = user.length() - 1; i >= 0 ; i--) {
            expectedPassword += user.charAt(i);
        }

        String pass = scanner.nextLine();
        int failedCount = 0;

        while (!pass.equals(expectedPassword)) {
            failedCount++;
             if (failedCount >= 4){
                  System.out.printf("User %s blocked!", user);
                  break;
              }
            System.out.println("Incorrect password. Try again.");
            pass = scanner.nextLine();
        }
        if (pass.equals(expectedPassword))
        System.out.printf("User %s logged in.", user);
    }
}
