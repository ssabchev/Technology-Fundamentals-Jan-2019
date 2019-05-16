package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeIntegers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String input = "";

        while (!"END".equals(input = reader.readLine())) {
            if (isPalindromeNumber(input)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

    }

    static boolean isPalindromeNumber (String input) {
        int enteredNumber = Integer.parseInt(input);
        String backwardsNumber = "";

        for (int i = input.length() - 1; i >=0 ; i--) {
            backwardsNumber += input.charAt(i);
        }

        int number = Integer.parseInt(backwardsNumber);

        if (enteredNumber == number){
            return true;
        } else {
            return false;
        }
    }
}
