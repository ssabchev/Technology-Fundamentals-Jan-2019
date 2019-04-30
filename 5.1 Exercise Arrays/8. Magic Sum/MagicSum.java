package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MagicSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int[] data = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int number = Integer.parseInt(reader.readLine());

        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] + data[j] == number) {
                    System.out.println(data[i] + " " + data[j]);
                }
            }
        }

    }
}
