package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int first = Integer.parseInt(reader.readLine());
        int second = Integer.parseInt(reader.readLine());
        int third = Integer.parseInt(reader.readLine());

        System.out.println(getSmallestNumber(first , second , third));

    }
    static int getSmallestNumber (int a, int b, int c) {
        int temp = 0;
        temp = Math.min(a , b);
        temp = Math.min(temp , c);
        return temp;
    }
}
