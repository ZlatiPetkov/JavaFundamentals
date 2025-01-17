package JavaBasics.ForLoop;

import java.util.Scanner;

public class VowelsSum_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < inputText.length(); i++) {
            char currentChar =  inputText.charAt(i);

            switch(currentChar) {
                case 'a'    -> sum+=1;
                case 'e'    -> sum+=2;
                case 'i'    -> sum+=3;
                case 'o'    -> sum+=4;
                case 'u'    -> sum+=5;
            }
        }
        System.out.println(sum);
    }
}
