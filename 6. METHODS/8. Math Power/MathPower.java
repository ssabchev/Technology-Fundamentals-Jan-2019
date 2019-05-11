package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathPower {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        double number = Double.parseDouble(reader.readLine());
        double power = Double.parseDouble(reader.readLine());

        System.out.println(mathPowerResult(number , power));

    }
    static double mathPowerResult (double number , double power) {
        double result = Math.pow(number , power);
        return result;
    }
}
