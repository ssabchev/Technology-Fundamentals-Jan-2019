package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommonElements {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String[] firstLine = reader.readLine().split("\\s+");
        String[] secondLine = reader.readLine().split("\\s+");

        String result = "";

        for (int i = 0; i < secondLine.length; i++) {
            for (int j = 0; j < firstLine.length; j++) {
                if (secondLine[i].equals(firstLine[j])) {   // or use .trim to print the result without extra space
                    if (i == secondLine.length - 1){
                        result += secondLine[i];
                    } else {
                        result += secondLine[i] + " ";
                    }
                }
            }
        }

        System.out.println(result);   //System.out.println(result.trim());

    }
}
