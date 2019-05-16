package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TopNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int number = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= number ; i++) {
            if (isTopNumber(i)) {
                System.out.println(i);
            }
        }

    }
    public static boolean isTopNumber (int number) {
        boolean isDivisible = false;
        boolean holdOneOddNumber = false;

        int sum = 0;
       int lastNumber = 0;

        while (number > 0) {
            lastNumber = number % 10;
            sum += lastNumber;
            if (!(lastNumber % 2 == 0)) {
                holdOneOddNumber = true;
            }
            number /= 10;
        }

        if (sum % 8 == 0) {
            isDivisible = true;
        }

        if (isDivisible && holdOneOddNumber) {
            return true;
        } else {
            return false;
        }

    }

}
