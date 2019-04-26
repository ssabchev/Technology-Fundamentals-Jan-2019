package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SumEvenNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int[] numbers = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int sumEvenNumbers = 0;

        for (int number : numbers) {
            if (number % 2 == 0){
                sumEvenNumbers += number;
            }
        }
        System.out.println(sumEvenNumbers);
    }
}
