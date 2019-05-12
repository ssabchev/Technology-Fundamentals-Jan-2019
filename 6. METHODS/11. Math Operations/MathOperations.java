package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class MathOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        double firstNumber = Double.parseDouble(reader.readLine());
        String command = reader.readLine();
        double secondNumber = Double.parseDouble(reader.readLine());


        DecimalFormat df = new DecimalFormat("#.##");

        switch (command) {
            case "+":
                System.out.println(df.format(addCommand(firstNumber, secondNumber)));
                break;
            case "-":
                System.out.println(df.format(removeCommand(firstNumber, secondNumber)));
                break;
            case "/":
                System.out.println(df.format(divideCommand(firstNumber, secondNumber)));
                break;
            case "*":
                System.out.println(df.format(multiplyCommand(firstNumber, secondNumber)));
                break;
            default:
                break;
        }

    }

    public static double addCommand(double first, double second) {
        double result = first + second;
        return result;
    }

    public static double removeCommand(double first, double second) {
        double result = first - second;
        return result;
    }

    public static double divideCommand(double first, double second) {
        double result = first / second;
        return result;
    }

    public static double multiplyCommand(double first, double second) {
        double result = first * second;
        return result;
    }
}
