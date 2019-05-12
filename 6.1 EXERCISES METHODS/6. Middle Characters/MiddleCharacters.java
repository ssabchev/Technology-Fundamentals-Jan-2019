package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MiddleCharacters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String input = reader.readLine();

        System.out.println(findMiddleCharacter(input));
//        System.out.println(middle(input));


    }

    public  static String findMiddleCharacter (String input) {
        String result = "";
        if (input.length() % 2 == 0){
            for (int i = input.length() / 2 - 1; i < input.length() / 2 + 1 ; i++) {
                result += input.charAt(i);
            }
        } else {
            for (int i = input.length() / 2  ; i < input.length() / 2 + 1; i++) {
                result += input.charAt(i);
            }
        }
        return result;
    }

//    public static String middle(String input)
//    {
//        int position = 0;
//        int length = 0;
//        if (input.length() % 2 == 0)
//        {
//            position = input.length() / 2 - 1;
//            length = 2;
//        }
//        else
//        {
//            position = input.length() / 2;
//            length = 1;
//        }
//        return input.substring(position, position + length);
//    }
}
