package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharactersInRange {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        char firstChar = reader.readLine().charAt(0);
        char secondChar = reader.readLine().charAt(0);

        System.out.println(charactersInRange(firstChar, secondChar).trim());

    }
    public static String charactersInRange (char first , char second) {
        String result = "";
        int start = Math.min((int)first , (int)second);
        int end = Math.max((int)first , (int)second);

        for (int i = start + 1; i < end; i++) {
            result += (char)i + " " ;
        }
        return result;
    }
}
