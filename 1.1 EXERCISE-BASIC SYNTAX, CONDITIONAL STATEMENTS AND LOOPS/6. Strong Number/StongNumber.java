package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StongNumber {
    public static void main(String[] args) throws IOException {

        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int number = Integer.parseInt(reader.readLine());

        int data = number;
        int factorial = 1;
        int sum = 0;

        while (number > 0) {
            int lastDigit = number % 10;

            for (int i = 1; i <= lastDigit; i++) {
                factorial *= i;
            }

            sum += factorial;
            factorial = 1;
            number = number / 10;
        }

        if (sum == data) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
