package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NxN {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int number = Integer.parseInt(reader.readLine());

        for (int i = 0; i < number; i++) {
            System.out.println(rowOfNumbers(number));
        }


    }

    static String rowOfNumbers (int number){
        String result = "";
        for (int n = 0; n < number; n++) {
            result +=  number + " ";
        }
        return result.trim();
    }

}
