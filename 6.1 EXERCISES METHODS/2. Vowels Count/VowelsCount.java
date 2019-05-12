package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelsCount {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String input = reader.readLine().toLowerCase();

        System.out.println(getVowelsCount(input));

    }

    static int getVowelsCount (String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (symbol == 'a' ||
                    symbol == 'e' ||
                    symbol == 'o' ||
                    symbol == 'i' ||
                    symbol == 'u' ||
                    symbol == 'y' ) {
                count++;
            }
        }
        return count;
    }
}
