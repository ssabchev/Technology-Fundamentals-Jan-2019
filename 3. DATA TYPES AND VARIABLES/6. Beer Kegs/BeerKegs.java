package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeerKegs {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int inputLines = Integer.parseInt(reader.readLine());

        String biggestKeg = "";
        double biggestResult = 0.0;

        for (int i = 0; i < inputLines; i++) {
            String name = reader.readLine();
            double radius = Double.parseDouble(reader.readLine());
            int height = Integer.parseInt(reader.readLine());

            double result = Math.PI * (Math.pow(radius,2)) * height;

            if (result > biggestResult){
                biggestKeg = name;
                biggestResult = result;
            }
        }

        System.out.println(biggestKeg);

    }
}
