package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpiceMustFlow {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int startingYield = Integer.parseInt(reader.readLine());

        int days = 0;
        int tolalYield = 0;

        while (startingYield >= 100) {
            days++;
            tolalYield += startingYield - 26;
            startingYield -= 10;

            if (startingYield < 100){
                tolalYield -= 26;
            }
        }

        System.out.println(days);
        System.out.println(tolalYield);

    }
}
