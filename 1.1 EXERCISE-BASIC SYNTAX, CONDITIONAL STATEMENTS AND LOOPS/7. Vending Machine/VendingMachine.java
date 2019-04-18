package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VendingMachine {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String input = "";

        double totalSum = 0.0;

        while (!"Start".equals(input = reader.readLine())) {
            double coin = Double.parseDouble(input);
            if (coin == 0.1) {
                totalSum += 0.1;
            } else if (coin == 0.2) {
                totalSum += 0.2;
            } else if (coin == 0.5) {
                totalSum += 0.5;
            } else if (coin == 1.0) {
                totalSum += 1;
            } else if (coin == 2.0) {
                totalSum += 2;
            } else {
                System.out.println(String.format("Cannot accept %.2f",
                        Double.parseDouble(input)));
            }
        }

        while (!"End".equals(input = reader.readLine())) {
            if ("Nuts".equals(input)) {
                if (totalSum >= 2) {
                    System.out.println(String.format("Purchased %s", input));
                    totalSum -= 2;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if ("Water".equals(input)) {
                if (totalSum >= 0.7) {
                    System.out.println(String.format("Purchased %s", input));
                    totalSum -= 0.7;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if ("Crisps".equals(input)) {
                if (totalSum >= 1.5) {
                    System.out.println(String.format("Purchased %s", input));
                    totalSum -= 1.5;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if ("Soda".equals(input)) {
                if (totalSum >= 0.8) {
                    System.out.println(String.format("Purchased %s", input));
                    totalSum -= 0.8;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if ("Coke".equals(input)) {
                if (totalSum >= 1) {
                    System.out.println(String.format("Purchased %s", input));
                    totalSum -= 1;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else {
                System.out.println("Invalid product");
            }
        }

        System.out.println(String.format("Change: %.2f", totalSum));
    }
}
