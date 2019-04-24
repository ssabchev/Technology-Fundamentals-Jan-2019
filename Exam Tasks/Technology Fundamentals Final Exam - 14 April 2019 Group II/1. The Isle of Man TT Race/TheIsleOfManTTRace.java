package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheIsleOfManTTRace {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String regex = "^([#$%*&])(?<name>[A-Za-z]+)\\1=(?<length>[0-9]+)!!(?<word>.+)$";

        Pattern pattern = Pattern.compile(regex);
        StringBuilder result = new StringBuilder();

        String input = reader.readLine();
        while (true) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String racerName = matcher.group("name");
                int encryptionLength = Integer.parseInt(matcher.group("length"));
                String coordinates = matcher.group("word");
                if (encryptionLength != coordinates.length()) {
                    System.out.println("Nothing found!");
                } else {
                    for (int i = 0; i < coordinates.length(); i++) {
                        int symbol = (int) (coordinates.charAt(i));
                        result.append((char) (symbol + encryptionLength));
                    }
                    System.out.println(String.format("Coordinates found! %s -> %s", racerName, result));
                    return;
                }
            } else {
                System.out.println("Nothing found!");
            }
            input = reader.readLine();
        }
    }
}
