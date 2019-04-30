package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ladybugs {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int fieldLength = Integer.parseInt(reader.readLine());

        int[] ladybugsIndex = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int[] field = new int[fieldLength];

        for (int j = 0; j < ladybugsIndex.length; j++) {
            field[ladybugsIndex[j]] = 1;
        }

        String input = "";

        while (!"end".equals(input = reader.readLine())) {
            String[] data = input.split("\\s+");
            int index = Integer.parseInt(data[0]);
            String command = data[1];
            int distance = Integer.parseInt(data[2]);

           if (index >=)



            if (command.equals("right")) {
                field[index] = 0;

                for (int i = index; i < field.length -1 ; i++) {
                    if ((i + distance) > field.length) {
                        break;
                    } else if (field[i + distance] != 1) {
                        field[i + distance] = 1;
                        break;
                    }
                }
            } else {
                field[index] = 0;

                for (int i = index; i >= 0 ; i--) {
                    if ((i - distance) < 0) {
                        break;
                    } else if (field[i - distance] != 1) {
                        field[i - distance] = 1;
                        break;
                    }
                }
            }


        }


        for (int i : field) {
            System.out.print(i + " ");
        }

    }
}
