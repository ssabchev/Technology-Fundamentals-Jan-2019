package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SignOfInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int number = Integer.parseInt(reader.readLine());

        if (number == 0) {
            System.out.println("The number 0 is zero.");
        } else if (number > 0) {
            System.out.println(String.format("The number %d is positive.", number));
        } else {
            System.out.println(String.format("The number %d is negative.", number));
        }

    }
}
