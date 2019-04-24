package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PokeMon {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int pokePower = Integer.parseInt(reader.readLine());
        int distance = Integer.parseInt(reader.readLine());
        int exhaustFactor = Integer.parseInt(reader.readLine());

        int powerByHalf = pokePower / 2;

        int count = 0;

        while (pokePower >= distance) {
            count++;
            pokePower -= distance;
            if (pokePower == powerByHalf) {
                if (exhaustFactor != 0) {
                    pokePower = pokePower / exhaustFactor;
                }

            }
        }

        System.out.println(pokePower);
        System.out.println(count);

    }
}
