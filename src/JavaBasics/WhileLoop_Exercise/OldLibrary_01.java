package JavaBasics.WhileLoop_Exercise;

import java.util.Scanner;

public class OldLibrary_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String termination = "No More Books";
        String bookName = scanner.nextLine();
        String bookNameNew = scanner.nextLine();

        int booksCount = 0;

        while (!bookNameNew.equals(termination) && !bookNameNew.equals(bookName)) {

            bookNameNew = scanner.nextLine();

            booksCount++;
        }
        if (bookNameNew.equals(bookName)) {
            System.out.printf("You checked %d books and found it.", booksCount);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", booksCount);
        }
    }
}
