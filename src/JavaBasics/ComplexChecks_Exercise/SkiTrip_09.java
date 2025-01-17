package ComplexChecks_Exercise;

import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int duration = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String score = scanner.nextLine();
        double price = 0.0;


        if (duration < 10) {
            switch (room) {
                case "room for one person" -> {
                    switch (score) {
                        case "positive" -> price = (duration - 1) * 18 * 1.25;
                        case "negative" -> price = (duration - 1) * 18 * 0.9;
                    }
                }
                case "apartment" -> {
                    switch (score) {
                        case "positive" -> price = (((duration - 1) * 25 )*0.7) * 1.25;
                        case "negative" -> price = (((duration - 1) * 25 )*0.9) * 0.9;
                    }
                }
                case "president apartment" -> {
                    switch (score) {
                        case "positive" -> price = (duration - 1) * 35 * 1.25;
                        case "negative" -> price = (duration - 1) * 35 * 0.9;
                    }
                }
            }
        } else if (duration <= 15) {
            switch (room) {
                case "room for one person" -> {
                    switch (score) {
                        case "positive" -> price = (duration - 1) * 18 * 1.25;
                        case "negative" -> price = (duration - 1) * 18 * 0.9;
                    }
                }
                case "apartment" -> {
                    switch (score) {
                        case "positive" -> price = (((duration - 1) * 25 )*0.65) * 1.25;
                        case "negative" -> price = (((duration - 1) * 25 )*0.65) * 0.9;
                    }
                }
                case "president apartment" -> {
                    switch (score) {
                        case "positive" -> price = (((duration - 1) * 35 )*0.85) * 1.25;
                        case "negative" -> price = (((duration - 1) * 35 )*0.85) * 0.9;
                    }
                }
            }
        } else {
            switch (room) {
                case "room for one person" -> {
                    switch (score) {
                        case "positive" -> price = (duration - 1) * 18 * 1.25;
                        case "negative" -> price = (duration - 1) * 18 * 0.9;
                    }
                }
                case "apartment" -> {
                    switch (score) {
                        case "positive" -> price = (((duration - 1) * 25 )*0.5) * 1.25;
                        case "negative" -> price = (((duration - 1) * 25 )*0.5) * 0.9;
                    }
                }
                case "president apartment" -> {
                    switch (score) {
                        case "positive" -> price = (((duration - 1) * 35 )*0.8) * 1.25;
                        case "negative" -> price = (((duration - 1) * 35 )*0.8) * 0.9;
                    }
                }
            }
        }
        System.out.printf("%.2f", price);
    }
}