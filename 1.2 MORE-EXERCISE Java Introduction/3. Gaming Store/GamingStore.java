package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GamingStore {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        System.in));

        double balance = Double.parseDouble(reader.readLine());

        String input = "";
        double spentMoney = 0.0;

        while (!"Game Time".equals(input = reader.readLine())) {

            if (input.equals("OutFall 4") || input.equals("RoverWatch Origins Edition")) {
                if (balance < 39.99) {
                    System.out.println("Too Expensive");
                } else {
                    System.out.println(String.format("Bought %s", input));
                    balance -= 39.99;
                    spentMoney += 39.99;
                    if (balance == 0) {
                        System.out.println("Out of money!");
                        return;
                    }
                }
            } else if (input.equals("CS: OG")) {
                if (balance < 15.99) {
                    System.out.println("Too Expensive");
                } else {
                    System.out.println(String.format("Bought %s", input));
                    balance -= 15.99;
                    spentMoney += 15.99;
                    if (balance == 0) {
                        System.out.println("Out of money!");
                        return;
                    }
                }
            } else if (input.equals("Zplinter Zell")) {
                if (balance < 19.99) {
                    System.out.println("Too Expensive");
                } else {
                    System.out.println(String.format("Bought %s", input));
                    balance -= 19.99;
                    spentMoney += 19.99;
                    if (balance == 0) {
                        System.out.println("Out of money!");
                        return;
                    }
                }
            } else if (input.equals("Honored 2")) {
                if (balance < 59.99) {
                    System.out.println("Too Expensive");
                } else {
                    System.out.println(String.format("Bought %s", input));
                    balance -= 59.99;
                    spentMoney += 59.99;
                    if (balance == 0) {
                        System.out.println("Out of money!");
                        return;
                    }
                }
            } else if (input.equals("RoverWatch")) {
                if (balance < 29.99) {
                    System.out.println("Too Expensive");
                } else {
                    System.out.println(String.format("Bought %s", input));
                    balance -= 29.99;
                    spentMoney += 29.99;

                    if (balance == 0) {
                        System.out.println("Out of money!");
                        return;
                    }
                }
            } else {
                System.out.println("Not Found");
            }
        }

        System.out.println(String.format("Total spent: $%.2f. Remaining: $%.2f",
                spentMoney, balance));

    }
}