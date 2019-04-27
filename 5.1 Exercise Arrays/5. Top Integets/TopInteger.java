package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TopInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int[] data = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        boolean isBigger = false;
        String result = "";

        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if ((data[i] > data[j])){
                    isBigger = true;
                } else {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger || (i == data.length - 1)) {
                result += data[i] + " ";
                isBigger = false;
            }

        }

        System.out.println(result);
    }
}

