package JavaBasics.TestExam;

import java.util.Scanner;

public class Gymnastics_E05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String tool = scanner.nextLine();

        double score = 0.0;
        double maxScore = 20;

        switch (country) {
            case "Russia" -> {
                if (tool.equals("ribbon")) {
                    score = 9.1+9.4;
                } else if(tool.equals("hoop")) {
                    score = 9.3+9.8;
                } else if(tool.equals("rope")) {
                    score = 9.6+9.0;
                }
            }
            case "Bulgaria" -> {
                if (tool.equals("ribbon")) {
                    score = 9.6+9.4;
                } else if(tool.equals("hoop")) {
                    score = 9.55+9.75;
                } else if(tool.equals("rope")) {
                    score = 9.5+9.4;
                }
            }
            case "Italy" -> {
                if (tool.equals("ribbon")) {
                    score = 9.2+9.5;
                } else if(tool.equals("hoop")) {
                    score = 9.45+9.35;
                } else if(tool.equals("rope")) {
                    score = 9.7+9.15;
                }
            }
        }
        System.out.printf("The team of %s get %.3f on %s.\n", country, score, tool);
        System.out.printf("%.2f%%",((maxScore-score)/20)*100);

    }
}
