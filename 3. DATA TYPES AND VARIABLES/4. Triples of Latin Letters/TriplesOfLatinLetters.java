package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriplesOfLatinLetters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int number = Integer.parseInt(reader.readLine());


        for (int i = 97; i < 97 + number; i++) {
            for (int j = 97; j < 97 + number ; j++) {
                for (int k = 97; k < 97 + number; k++) {

                    System.out.println(String.format("%c%c%c",
                            i,
                            j,
                            k));
                }

            }

        }

    }
}
