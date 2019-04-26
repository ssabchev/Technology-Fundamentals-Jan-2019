package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Train {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int wagons = Integer.parseInt(reader.readLine());

        int[] train = new int[wagons];

        int sumOfPeople = 0;

        for (int i = 0; i < wagons; i++) {
            train[i] = Integer.parseInt(reader.readLine());
            sumOfPeople += train[i];
        }

        for (int i = 0; i < train.length; i++) {
            if (i == train.length - 1){
                System.out.println(train[i]);
            } else {
                System.out.print(train[i] + " ");
            }
        }
        System.out.println(sumOfPeople);
    }
}
