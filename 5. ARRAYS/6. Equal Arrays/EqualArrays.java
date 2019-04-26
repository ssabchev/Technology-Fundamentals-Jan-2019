package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EqualArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );
        int[] fistArray = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int[] secondArray = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int sum = 0;

        for (int i = 0; i < fistArray.length; i++) {
            if (fistArray[i] == secondArray[i]) {
                sum += fistArray[i];
            } else {
                System.out.println(String.format("Arrays are not identical. Found difference at %d index.", i));
                return;
            }
        }

        System.out.println(String.format("Arrays are identical. Sum: %d", sum));

    }
}
