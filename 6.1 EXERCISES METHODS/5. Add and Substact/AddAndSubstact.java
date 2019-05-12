package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddAndSubstact {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int firstInt = Integer.parseInt(reader.readLine());
        int secondInt = Integer.parseInt(reader.readLine());
        int thirdInt = Integer.parseInt(reader.readLine());


        System.out.println(substactElements(addAndSubstact(firstInt, secondInt), thirdInt));


    }

    public static int addAndSubstact(int first, int second) {
        return first + second;
    }

    static int substactElements(int number, int third) {
        return number - third;
    }

}
