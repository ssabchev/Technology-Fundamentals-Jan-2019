package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreaterOfTwoValues {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String type = reader.readLine().toLowerCase();
        String first = reader.readLine();
        String second = reader.readLine();

        switch (type) {
            case "int":
                int firstInt = Integer.parseInt(first);
                int secondInt = Integer.parseInt(second);
                System.out.println(getMax(firstInt, secondInt));
                break;
            case "char":
                char firstChar = first.charAt(0);
                char secondChar = second.charAt(0);
                System.out.println(getMax(firstChar, secondChar));
                break;
            case "string":
                System.out.println(getMax(first, second));
                break;
            default:
                break;
        }


    }

    public static int getMax(int first, int second) {
        if (first >= second) {
            return first;
        } else {
            return second;
        }
    }

    public static char getMax(char first, char second) {
        if (first >= second) {
            return first;
        } else {
            return second;
        }
    }

    public static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        } else {
            return second;
        }
    }
}

