package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        System.in));

        int numberOne = Integer.parseInt(reader.readLine());
        int numberTwo = Integer.parseInt(reader.readLine());
        int numberThree = Integer.parseInt(reader.readLine());

        int firstNumberMax = Math.max(numberOne , numberTwo);
        int totalMax = Math.max(firstNumberMax , numberThree);
        System.out.println(totalMax);

        if (numberOne == totalMax) {
            System.out.println(Math.max(numberTwo , numberThree));
            System.out.println(Math.min(numberTwo , numberThree));
        } else if (numberTwo == totalMax){
            System.out.println(Math.max(numberOne , numberThree));
            System.out.println(Math.min(numberOne , numberThree));
        } else {
            System.out.println(Math.max(numberOne , numberTwo));
            System.out.println(Math.min(numberOne , numberTwo));
        }

    }
}
