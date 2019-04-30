package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EqualSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int[] numbers = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        if (numbers.length <= 1) {
            System.out.println("0");
            return;
        }

        int sumLeft = 0;
        int sumRight = 0;
        boolean noMatch = true;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (j < i) {
                    sumLeft += numbers[j];
                } else if (j > i) {
                    sumRight += numbers[j];
                }
            }

            if (sumLeft == sumRight) {
                System.out.println(i);
                noMatch = false;
                break;
            } else {
                sumLeft = 0;
                sumRight = 0;
            }
        }

        if (noMatch) {
            System.out.println("no");
        }
    }
}
