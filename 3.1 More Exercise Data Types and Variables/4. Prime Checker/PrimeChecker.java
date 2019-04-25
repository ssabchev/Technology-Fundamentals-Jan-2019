package com.company;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int topBorder = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= topBorder; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, isPrime);
        }
    }
}