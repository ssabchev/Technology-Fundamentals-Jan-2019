package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FloatingEquality {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        double num1 = Double.parseDouble(reader.readLine());
        double num2 = Double.parseDouble(reader.readLine());

        double maxDiff = 0.000001;

        double diff = Math.abs(num1 - num2);

        if (diff >= maxDiff) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}
