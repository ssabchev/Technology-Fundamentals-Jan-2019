package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZigZagArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int lines = Integer.parseInt(reader.readLine());

        String[] firstArray = new String[lines];
        String[] secondArray = new String[lines];

        for (int i = 0; i < lines; i++) {

            String[] data = reader.readLine().split("\\s+");

            if (i % 2 == 0) {
                firstArray[i] = data[0];
                secondArray[i] = data[1];
            } else {
                firstArray[i] = data[1];
                secondArray[i] = data[0];
            }
        }

        for (String element1 : firstArray) {
            System.out.print(element1 + " ");
        }
        System.out.println("");
        for (String element2 : secondArray) {
            System.out.print(element2 + " ");
        }

    }
}
