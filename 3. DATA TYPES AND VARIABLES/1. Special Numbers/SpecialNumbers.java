package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpecialNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );
        int input = Integer.parseInt(reader.readLine());
        int sum = 0;

        for (int i = 1; i <= input; i++) {
            int tempNumber = i;
            while (tempNumber > 0){
                int lastDigit = tempNumber % 10;
                sum += lastDigit;
                tempNumber = tempNumber / 10;
            }
            if (sum == 5 || sum == 7 || sum == 11){
                System.out.println(String.format("%d -> True",i));
            } else {
                System.out.println(String.format("%d -> False",i));
            }
            sum = 0;
        }

    }
}
