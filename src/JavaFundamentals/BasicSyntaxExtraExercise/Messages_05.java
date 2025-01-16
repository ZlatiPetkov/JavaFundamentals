package JavaFundamentals.BasicSyntaxExtraExercise;

import java.util.Scanner;

public class Messages_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String text = "";

        for (int i = 1; i <= size ; i++) {
            String input = scanner.nextLine();
            int digit = Integer.parseInt(String.valueOf(input.charAt(0)));
            int length = input.length();
            int offset = 0;
                if (digit == 8 || digit ==9) {
                    offset = ((digit -2) * 3)+1;
                } else {
                    offset = (digit - 2) * 3;
                }
            int digitIndex = offset + length -1;
                switch(digitIndex)  {
                case 0 -> text +="a";
                case 1 -> text +="b";
                case 2 -> text +="c";
                case 3 -> text +="d";
                case 4 -> text +="e";
                case 5 -> text +="f";
                case 6 -> text +="g";
                case 7 -> text += "h";
                case 8 -> text +="i";
                case 9 -> text +="j";
                case 10 -> text +="k";
                case 11 -> text +="l";
                case 12 -> text +="m";
                case 13 -> text +="n";
                case 14 -> text +="o";
                case 15 -> text +="p";
                case 16 -> text +="q";
                case 17 -> text +="r";
                case 18 -> text +="s";
                case 19 -> text +="t";
                case 20 -> text +="u";
                case 21 -> text +="v";
                case 22 -> text +="w";
                case 23 -> text +="x";
                case 24 -> text +="y";
                case 25 -> text +="z";
                default -> text += " ";
            }
        }
        System.out.println(text);
    }
}
