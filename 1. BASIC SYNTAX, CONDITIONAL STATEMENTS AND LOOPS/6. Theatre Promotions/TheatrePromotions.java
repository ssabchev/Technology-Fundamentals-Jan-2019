package com.company;

import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayOfWeek = scanner.nextLine().toLowerCase();
        int age = Integer.parseInt(scanner.nextLine());

        int price = 0;

        if (age >= 0 && age <= 18){
            if (dayOfWeek.equals("weekday")){
                price = 12;
            } else if (dayOfWeek.equals("weekend")){
                price = 15;
            } else {
                price = 5;
            }
        } else if (age > 18 && age <= 64){
            if (dayOfWeek.equals("weekday")){
                price = 18;
            } else if (dayOfWeek.equals("weekend")){
                price = 20;
            } else {
                price = 12;
            }
        } else if (age > 64 && age <= 122){
            if (dayOfWeek.equals("weekday")){
                price = 12;
            } else if (dayOfWeek.equals("weekend")){
                price = 15;
            } else {
                price = 10;
            }
        } else {
            System.out.println("Error!");
            return;
        }

        System.out.println(price);

    }
}
