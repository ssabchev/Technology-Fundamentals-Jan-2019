package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfWeek {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int day = Integer.parseInt(reader.readLine());

        String[] data = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (day <= 0 || day > 7) {
            System.out.println("Invalid Day!");
        } else {
            printDayOfTheWeek(day , data);
        }

    }
    public static String printDayOfTheWeek (int day, String[] weekdays) {
        String result = weekdays[day - 1];
        System.out.println(result);
        return result;
    }
}
