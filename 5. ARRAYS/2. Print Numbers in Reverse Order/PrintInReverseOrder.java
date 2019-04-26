package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintInReverseOrder {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int lines = Integer.parseInt(reader.readLine());

        int[] numbers = new int[lines];

        for (int i = 0; i < lines; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
