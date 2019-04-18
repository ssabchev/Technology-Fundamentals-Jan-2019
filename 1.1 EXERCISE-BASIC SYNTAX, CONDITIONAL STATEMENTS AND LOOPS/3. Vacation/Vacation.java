package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int countOfTheGuests = Integer.parseInt(scanner.nextLine());
        String typeOfTheGuests = scanner.nextLine();
        String day = scanner.nextLine();




        if (typeOfTheGuests.equals("Students")){
            if (countOfTheGuests < 30){
                if (day.equals("Friday")){
                    System.out.printf("Total price: %.2f", countOfTheGuests * 8.45);
                } else if (day.equals("Saturday")){
                    System.out.printf("Total price: %.2f", countOfTheGuests * 9.80);
                } else {
                    System.out.printf("Total price: %.2f", countOfTheGuests * 10.46);
                }
            } else {
                if (day.equals("Friday")){
                    System.out.printf("Total price: %.2f", (countOfTheGuests * 8.45) - ((countOfTheGuests * 8.45) * 0.15));
                } else if (day.equals("Saturday")){
                    System.out.printf("Total price: %.2f", ((countOfTheGuests * 9.80) - ((countOfTheGuests * 9.80) * 0.15)));
                } else {
                    System.out.printf("Total price: %.2f", (countOfTheGuests * 10.46) - ((countOfTheGuests * 10.46) * 0.15));
                }
            }
        } else if (typeOfTheGuests.equals("Business")){
            if (countOfTheGuests < 100){
                if (day.equals("Friday")){
                    System.out.printf("Total price: %.2f", countOfTheGuests * 10.90);
                } else if (day.equals("Saturday")){
                    System.out.printf("Total price: %.2f", countOfTheGuests * 15.60);
                } else {
                    System.out.printf("Total price: %.2f", countOfTheGuests * 16.0);
                }
            } else {
                if (day.equals("Friday")){
                    System.out.printf("Total price: %.2f", (countOfTheGuests * 10.90) - (10 * 10.90));
                } else if (day.equals("Saturday")){
                    System.out.printf("Total price: %.2f", (countOfTheGuests * 15.60) - ((10 * 15.60)));
                } else {
                    System.out.printf("Total price: %.2f", (countOfTheGuests * 10.46) - (10 * 10.46));
                }
            }
        } else if (typeOfTheGuests.equals("Regular")){
            if (countOfTheGuests < 10 || countOfTheGuests > 20){
                if (day.equals("Friday")){
                    System.out.printf("Total price: %.2f", countOfTheGuests * 15.0);
                } else if (day.equals("Saturday")){
                    System.out.printf("Total price: %.2f", countOfTheGuests * 20.0);
                } else {
                    System.out.printf("Total price: %.2f", countOfTheGuests * 22.50);
                }
            } else {
                if (day.equals("Friday")){
                    System.out.printf("Total price: %.2f", (countOfTheGuests * 15) - (countOfTheGuests * 15) * 0.05);
                } else if (day.equals("Saturday")){
                    System.out.printf("Total price: %.2f", ((countOfTheGuests * 20) - ((countOfTheGuests * 20) * 0.05)));
                } else {
                    System.out.printf("Total price: %.2f", (countOfTheGuests * 22.50) - (countOfTheGuests * 22.50) * 0.05);
                }
            }
        }


    }
}
