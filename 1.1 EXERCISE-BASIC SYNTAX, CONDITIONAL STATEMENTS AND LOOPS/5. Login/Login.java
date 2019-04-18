package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Login {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String username = reader.readLine();
        String password = "";

        String input = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);
        }
        
        for (int i = 0; i <= 3; i++) {
            input = reader.readLine();

            if (password.equals(input)) {
                System.out.println(String.format("User %s logged in.", username));
                return;
            } else if (i != 3) {
                System.out.println(String.format("Incorrect password. Try again."));
            } else {
                System.out.println(String.format("User %s blocked!", username));
            }
        }

    }
}
