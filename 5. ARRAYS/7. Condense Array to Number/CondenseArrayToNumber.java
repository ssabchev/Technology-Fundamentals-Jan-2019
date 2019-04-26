package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CondenseArrayToNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int[] input = Arrays.stream(reader.readLine()
                .split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int[] condensed = new int[input.length - 1];

        while (input.length > 1) {
            for (int i = 0; i < input.length - 1 ; i++) {
                    condensed[i] = input[i] + input[i + 1];
            }
            input = condensed;
        }

        System.out.println(input[0]);

    }
}
