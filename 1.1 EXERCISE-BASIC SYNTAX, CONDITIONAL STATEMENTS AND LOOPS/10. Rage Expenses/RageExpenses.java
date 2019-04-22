package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RageExpenses {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        System.in));

        int lostGames = Integer.parseInt(reader.readLine());
        double headsetPrice = Double.parseDouble(reader.readLine());
        double mousePrice = Double.parseDouble(reader.readLine());
        double keyboardPrice = Double.parseDouble(reader.readLine());
        double displayPrice = Double.parseDouble(reader.readLine());

        int trashedMouseCount = 0;
        int trashedKeyboardCount = 0;

        double totalMoney = 0.0;

        for (int i = 1; i <= lostGames; i++) {
            if (i % 2 == 0){
                totalMoney += headsetPrice;
            }
            if (i % 3 == 0){
                totalMoney += mousePrice;
                trashedMouseCount++;
                if (trashedMouseCount == 2){
                    totalMoney += keyboardPrice;
                    trashedKeyboardCount++;
                    trashedMouseCount = 0;
                }
                if (trashedKeyboardCount == 2){
                    totalMoney += displayPrice;
                    trashedKeyboardCount = 0;
                }
            }

        }

        System.out.println(String.format("Rage expenses: %.2f lv.", totalMoney));


    }
}
