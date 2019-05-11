package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Orders {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String product = reader.readLine();
        int quantity = Integer.parseInt(reader.readLine());

        totalPrice(product , quantity);

    }

    static void totalPrice (String product , int quantity) {
        if (product.equals("coffee")){
            System.out.printf("%.2f" , quantity * 1.50);
        } else if (product.equals("water")){
            System.out.printf("%.2f" , quantity * 1.0);
        } else if (product.equals("coke")){
            System.out.printf("%.2f" , quantity * 1.40);
        } else {
            System.out.printf("%.2f" , quantity * 2.0);
        }
    }

}
