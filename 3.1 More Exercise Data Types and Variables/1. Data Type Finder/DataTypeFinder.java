package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataTypeFinder {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String input = "";

        while (!"END".equals(input = reader.readLine())) {

            boolean isInt = true;

            try {
                int number = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                isInt = false;
            }

            boolean isDouble = true;

            try {
                double number = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                isDouble = false;
            }

            if (isInt) {
                System.out.println(String.format("%s is integer type", input));
            } else if (isDouble) {
                System.out.println(String.format("%s is floating point type", input));
            } else if (input.toLowerCase().equals("true") || input.toLowerCase().equals("false")) {
                System.out.println(String.format("%s is boolean type", input));
            } else if (input.length() == 1) {
                System.out.println(String.format("%s is character type", input));
            } else {
                System.out.println(String.format("%s is string type", input));
            }

        }
    }
}
