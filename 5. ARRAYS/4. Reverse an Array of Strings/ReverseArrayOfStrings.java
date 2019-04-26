package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseArrayOfStrings {
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );
        
        String[] data = reader.readLine().split("\\s+");

        for (int i = data.length - 1; i >= 0 ; i--) {
            if (i == 0){
                System.out.print(data[i]);
            } else {
                System.out.print(data[i] + " ");
            }
        }

    }
}
