package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        System.in));

        String studentName = reader.readLine();
        int studentAge = Integer.parseInt(reader.readLine());
        double studentGrade = Double.parseDouble(reader.readLine());

        String format = "Name: %s, Age %d, Grade: %.2f%n";
        System.out.printf(format,
                studentName,
                studentAge,
                studentGrade);

    }
}
