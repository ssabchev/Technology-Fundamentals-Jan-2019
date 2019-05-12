package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String input = reader.readLine();

        if (isValidPassword(input)) {
            System.out.println("Password is valid");
        } else {
            if (!validRange(input)) {
                System.out.println("Password must be between 6 and 10 characters");
            }
            if (!validConsists(input)) {
                System.out.println("Password must consist only of letters and digits");
            }
            if (!haveTwoDigits(input)) {
                System.out.println("Password must have at least 2 digits");
            }
        }



    }

    public static boolean validRange(String input) {
        if (input.length() > 5 && input.length() < 11) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validConsists(String input) {
        String regex = "^[A-Za-z0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean haveTwoDigits(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) > 47 && input.charAt(i) < 58) {
                count++;
            }
        }
        if (count >= 2) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValidPassword(String input) {
        if (validRange(input) && haveTwoDigits(input) && validConsists(input)) {
            return true;
        } else {
            return false;
        }
    }
}

