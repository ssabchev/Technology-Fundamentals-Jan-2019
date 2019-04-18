package com.company;

import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String countryInput = scanner.nextLine();

        if (countryInput.equals("USA") || countryInput.equals("England")) {
            System.out.println("English");
        } else if (countryInput.equals("Spain")
                || countryInput.equals("Argentina")
                || countryInput.equals("Mexico")) {
            System.out.println("Spanish");
        } else {
            System.out.println("unknown");
        }
    }
}
