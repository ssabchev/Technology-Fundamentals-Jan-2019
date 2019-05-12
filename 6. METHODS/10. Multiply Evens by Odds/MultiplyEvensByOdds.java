package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplyEvensByOdds {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int number = Math.abs(Integer.parseInt(reader.readLine()));

        System.out.println(getMultiplySum(number));

    }

    public static int getMultiplySum (int number) {
        int sumEven = 0;
        int sumOdds = 0;

        while (number > 0) {
            int lastNumber = number % 10;
            if (lastNumber % 2 == 0) {
                sumEven += lastNumber;
            } else {
                sumOdds += lastNumber;
            }
            number /= 10;
        }
        return sumEven * sumOdds;
    }
}
