package com.company;

import java.util.Scanner;

public class SumOfOddNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        int count = 0;

        for (int i = 1; i <= 100; i+=2) {
            System.out.println(i);
            sum += i;
            count++;
            if (count == num){
                break;
            }
        }

        System.out.println("Sum: " + sum);
    }
}
