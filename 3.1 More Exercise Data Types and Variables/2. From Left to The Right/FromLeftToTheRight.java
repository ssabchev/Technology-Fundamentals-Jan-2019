package com.company;

import java.io.IOException;
import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int inputLines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < inputLines; i++) {

            String data = scanner.nextLine();

            int index = data.indexOf(" ");

            double num1 = Double.parseDouble(data.substring(0, index));
            double num2 = Double.parseDouble(data.substring(index + 1));

//                double num1 = Double.parseDouble(scanner.next());
//                double num2 = Double.parseDouble(scanner.next());

                int sum = 0;
                if (num1 > num2) {
                    double numFirst = Math.abs(num1);
                    while (numFirst > 0) {
                        sum += (numFirst % 10);
                        numFirst /= 10;
                    }
                } else {
                    double numSecond = Math.abs(num2);
                    while (numSecond > 0) {
                        sum += (numSecond % 10);
                        numSecond /= 10;
                    }
                }
                System.out.println(Math.abs(sum));
            }
        }
    }