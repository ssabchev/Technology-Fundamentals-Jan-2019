package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Snowballs {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int inputNumber = Integer.parseInt(reader.readLine());

        int tempSnow = 0;
        int tempTime = 0;
        int tempQuality = 0;
        double tempValue = 0;



        for (int i = 0; i < inputNumber; i++) {
            int snowballSnow = Integer.parseInt(reader.readLine());
            int snowballTime = Integer.parseInt(reader.readLine());
            int snowballQuality = Integer.parseInt(reader.readLine());

            double snowballValue = Math.floor(Math.pow((snowballSnow / snowballTime),snowballQuality));

            if (snowballValue > tempValue){
                tempSnow = snowballSnow;
                tempQuality = snowballQuality;
                tempTime =snowballTime;
                tempValue = snowballValue;
            }
        }

        System.out.println(String.format("%d : %d = %.0f (%d)",
                tempSnow,
                tempTime,
                tempValue,
                tempQuality));

    }
}
