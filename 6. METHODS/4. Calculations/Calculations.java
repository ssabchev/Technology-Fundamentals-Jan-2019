package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculations {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String command = reader.readLine().toLowerCase();
        double numberOne = Double.parseDouble(reader.readLine());
        double numberTwo = Double.parseDouble(reader.readLine());

        if (command.equals("add")) {
            printAddResult(numberOne , numberTwo);
        } else if (command.equals("multiply")){
            printMultiplyResult(numberOne , numberTwo);
        } else if (command.equals("subtract")){
            printSubtractResult(numberOne , numberTwo);
        } else {
            printDivideResult(numberOne , numberTwo);
        }

    }
    static void printAddResult (double num1, double num2){
        System.out.println(num1 + num2);
    }
    static void printMultiplyResult (double num1, double num2){
        System.out.println(num1 * num2);
    }
    static void printSubtractResult (double num1, double num2){
        System.out.println(num1 - num2);
    }
    static void printDivideResult (double num1, double num2){
       if (num2 != 0) {
           System.out.println(num1 / num2);
       }
    }
}
