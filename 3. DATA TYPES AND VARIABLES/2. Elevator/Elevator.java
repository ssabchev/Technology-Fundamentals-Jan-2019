package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Elevator {
    public static void main(String[] args) throws IOException {

        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int people = Integer.parseInt(reader.readLine());
        int capacity = Integer.parseInt(reader.readLine());

        if (capacity >= people) {
            System.out.println(1);
            return;
        } else {
            int fullCources = (people / capacity);

            if (people % capacity == 0){
                System.out.println(fullCources);
            } else {
                System.out.println(fullCources + 1);
            }
        }

    }
}
