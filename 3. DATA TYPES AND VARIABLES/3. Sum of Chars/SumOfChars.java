package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfChars {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int number = Integer.parseInt(reader.readLine());

        int sum = 0;

        for (int i = 0; i < number; i++) {
            char input = reader.readLine().charAt(0);
            sum += input;
        }

        System.out.println("The sum equals: " + sum);

    }
}
