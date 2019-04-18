package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintAndSum {
    public static void main(String[] args) throws IOException {

        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());

        int sum = 0;

        for (int i = firstNumber; i <= secondNumber; i++) {
            sum += i;
            if (i == secondNumber) {
                System.out.print(i);
                System.out.println();
            } else {
                System.out.print(i + " ");
            }
        }

        System.out.println("Sum: " + sum);

    }
}
