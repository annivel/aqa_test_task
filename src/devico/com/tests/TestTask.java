package devico.com.tests;

import java.util.Scanner;

public class TestTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNext("^[-+]?\\d{1,2}C$"))
            throw new IllegalArgumentException("The input value is not valid");

        int temperature = Integer.parseInt(scanner.findInLine("\\d{1,2}"));
        String message = "";
        if (temperature <= -1 && temperature >= -50) {
            message = "It’s super cold today. Be sure you dressed well!";
        } else if (temperature >= 0 && temperature <= 10) {
            message = "It’s windy outside, but we are sure you will enjoy your day!";
        } else if (temperature >= 11 && temperature <= 30) {
            message = "It’s time for outdoor walking!";
        } else if (temperature >= 41 && temperature <= 50) {
            message = "Welcome to hell!";
        } else {
            message = "Please re-check results in 5 mins";
        }
        System.out.println(message);
    }

}
