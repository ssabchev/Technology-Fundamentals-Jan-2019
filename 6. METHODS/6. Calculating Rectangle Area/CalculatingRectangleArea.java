package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatingRectangleArea {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        double width = Double.parseDouble(reader.readLine());
        double height = Double.parseDouble(reader.readLine());

        System.out.println(getRectangleArea(width , height));


    }
    public static double getRectangleArea (double width, double height){
        return width * height;
    }
}
