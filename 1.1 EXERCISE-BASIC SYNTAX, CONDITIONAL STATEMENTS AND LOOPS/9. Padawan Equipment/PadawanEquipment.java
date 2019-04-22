package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PadawanEquipment {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        System.in));

        double moneyHave = Double.parseDouble(reader.readLine());
        int stunedtsNumber = Integer.parseInt(reader.readLine());
        double priceOfLightsabers = Double.parseDouble(reader.readLine());
        double priceOfRobes = Double.parseDouble(reader.readLine());
        double priceOfBelts = Double.parseDouble(reader.readLine());

        int lightSabersNeeded = (int)Math.ceil(stunedtsNumber + (stunedtsNumber * 0.1));

        int freeBelt = stunedtsNumber / 6;

        double totalMoneyNeeded = (lightSabersNeeded * priceOfLightsabers)
                + (priceOfRobes * stunedtsNumber)
                + ((stunedtsNumber - freeBelt) * priceOfBelts);

        if (moneyHave < totalMoneyNeeded){
            System.out.println(String.format("Ivan Cho will need %.2flv more.",
                    totalMoneyNeeded - moneyHave));
        } else {
            System.out.println(String.format("The money is enough - it would cost %.2flv.",
                    totalMoneyNeeded));
        }

    }
}
