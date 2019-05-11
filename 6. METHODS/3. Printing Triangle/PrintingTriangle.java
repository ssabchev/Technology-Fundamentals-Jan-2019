package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintingTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );
        int input = Integer.parseInt(reader.readLine());

        printTriangle(input);

    }

    static void printTopPart(int input) {
        int count = 1;
        for (int i = 1; i <= input; i++) {
            for (int j = input - i; j < input; j++) {
                System.out.print(count + " ");
                count++;
            }
            count = 1;
            System.out.println();
        }
    }

    static void printBottonPart(int input) {
        int count = 1;
        for (int i = 1; i < input; i++) {
            for (int j = input - i; j > 0; j--) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
            count = 1;
        }
    }

    static void printTriangle(int input) {
        printTopPart(input);
        printBottonPart(input);
    }
}
