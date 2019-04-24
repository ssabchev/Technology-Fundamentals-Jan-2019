package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WaterOverflow {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int tankCapacity = 255;

        int entryNumber = Integer.parseInt(reader.readLine());
        int waterInsideTheTank = 0;

        for (int i = 0; i < entryNumber; i++) {
            int input = Integer.parseInt(reader.readLine());
            if (tankCapacity >= input) {
                waterInsideTheTank += input;
                tankCapacity -= input;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(waterInsideTheTank);

    }
}
