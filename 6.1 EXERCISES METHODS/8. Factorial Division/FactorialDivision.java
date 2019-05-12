package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialDivision {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());


        if (secondNumber == 0) {
            return;
        } else {
            double factorialDivision = factorial(firstNumber) / factorial(secondNumber);
            System.out.println(String.format("%.2f", factorialDivision));
        }
    }

    static double factorial(int number) {
        double result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

}



