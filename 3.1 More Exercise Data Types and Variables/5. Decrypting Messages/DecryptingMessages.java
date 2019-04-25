package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecryptingMessages {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int key = Integer.parseInt(reader.readLine());
        int lines = Integer.parseInt(reader.readLine());
        StringBuilder result = new StringBuilder();


        for (int i = 0; i < lines; i++) {
            char symbol = reader.readLine().charAt(0);
            char encryptedChar = (char)(symbol + key);

            result = result.append(encryptedChar);
        }
        System.out.println(result);
    }
}
