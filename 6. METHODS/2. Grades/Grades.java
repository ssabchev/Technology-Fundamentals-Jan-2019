package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Grades {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        double grade = Double.parseDouble(reader.readLine());

        gradeName(grade);


    }

    public static void gradeName (double grade) {
        if (grade < 3.0) {
            System.out.println("Fail");
        } else if (grade >= 3 && grade < 3.5) {
            System.out.println("Poor");
        } else if (grade >= 3.5 && grade < 4.5) {
            System.out.println("Good");
        } else if (grade >= 4.5 && grade < 5.5) {
            System.out.println("Very good");
        } else {
            System.out.println("Excellent");
        }
    }

}
