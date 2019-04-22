package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Messages {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        System.in));

        Map<Integer, String> messages = new LinkedHashMap<>();

        messages.put(2, "abc");
        messages.put(3, "def");
        messages.put(4, "ghi");
        messages.put(5, "jkl");
        messages.put(6, "mno");
        messages.put(7, "pqrs");
        messages.put(8, "tuv");
        messages.put(9, "wxyz");
        messages.put(0, " ");

        int count = Integer.parseInt(reader.readLine());
        String input = "";
        String text = "";

        int lastNumber = 0;

        for (int i = 0; i < count; i++) {

            input = reader.readLine();

            lastNumber = Integer.parseInt(input) % 10;

            switch (lastNumber) {
                case 2:
//                    if (input.length() == 1) {
//                        text += messages.get(lastNumber).charAt(0);
//                    } else if (input.length() == 2) {
//                        text += messages.get(lastNumber).charAt(1);
//                    } else if (input.length() == 3) {
//                        text += messages.get(lastNumber).charAt(2);
//                    }
                    text += letter(input, lastNumber, messages);
                    break;
                case 3:
                    text += letter(input, lastNumber, messages);
                    break;
                case 4:
                    text += letter(input, lastNumber, messages);
                    break;
                case 5:
                    text += letter(input, lastNumber, messages);
                    break;
                case 6:
                    text += letter(input, lastNumber, messages);
                    break;
                case 7:
                    text += letter(input, lastNumber, messages);
                    break;
                case 8:
                    text += letter(input, lastNumber, messages);
                    break;
                case 9:
                    text += letter(input, lastNumber, messages);
                    break;
                case 0:
                    text += messages.get(lastNumber);
                    break;
            }

        }
        System.out.println(text);
    }


    public static String letter(String input, int lastNumber, Map<Integer, String> messages) {
        String text = "";
        if (input.length() == 1) {
            text += messages.get(lastNumber).charAt(0);
        } else if (input.length() == 2) {
            text += messages.get(lastNumber).charAt(1);
        } else if (input.length() == 3) {
            text += messages.get(lastNumber).charAt(2);
        } else if (input.length() == 4) {
            text += messages.get(lastNumber).charAt(3);
        }
        return text;
    }
}
