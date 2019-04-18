package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackIn30Minutes {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        System.in));

        int hours = Integer.parseInt(reader.readLine());
        int minutes = Integer.parseInt(reader.readLine()) + 30;

        if (minutes > 60){
            hours += 1;
            minutes -= 60;
        }

        if (hours == 24){
            hours = 0;
        }
        if (minutes < 10){
            System.out.println(String.format("%d:0%d", hours, minutes));
        } else {
            System.out.println(String.format("%d:%d", hours, minutes));
        }

    }
}
