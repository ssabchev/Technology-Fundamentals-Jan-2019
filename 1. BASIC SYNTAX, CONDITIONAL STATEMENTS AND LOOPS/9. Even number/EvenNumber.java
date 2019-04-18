package com.company;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        boolean flag = true;

        do {
            if (input % 2 == 0) {
                System.out.println("The numberis: " + input);
                flag = false;
            } else {
                System.out.println("Please write an even number.");
                input = Integer.parseInt(scanner.nextLine());
            }
        } while (flag);


    }
}
