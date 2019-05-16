package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class ArrayManipulator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );


        int[] number = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        String input = "";

        while (!"end".equals(input = reader.readLine())) {
            String[] data = input.split(" ");

            String command = data[0];

            if (command.equals("exchange")) {
                int[] temp = new int[number.length];
                int count = 0;

                int index = Integer.parseInt(data[1]);
                if (index > number.length) {
                    System.out.println("Invalid index");
                } else {
                    for (int i = index + 1; i < number.length; i++) {
                        temp[count] = number[i];
                        count++;
                    }
                    for (int i = 0; i <= index; i++) {
                        temp[count] = number[i];
                        count++;
                    }
                    number = temp;
                }
            } else if (command.equals("max")) {
                String status = data[1];
                if (status.equals("even")) {
                    int max = Integer.MIN_VALUE;
                    int temp = 0;
                    int tempIndex = 0;
                    int maxIndex = 0;
                    for (int i = 0; i < number.length; i++) {
                        if (number[i] % 2 == 0) {
                            temp = number[i];
                            tempIndex = i;
                            if (temp > max) {
                                max = temp;
                                maxIndex = tempIndex;
                            }
                        }

                    }
                    if (!(max == Integer.MIN_VALUE)) {
                        System.out.println(maxIndex);
                    } else {
                        System.out.println("No matches");
                    }
                } else {
                    int max = Integer.MIN_VALUE;
                    int temp = 0;
                    int tempIndex = 0;
                    int maxIndex = 0;
                    for (int i = 0; i < number.length; i++) {
                        if (!(number[i] % 2 == 0)) {
                            tempIndex = i;
                            temp = number[i];
                            if (temp > max) {
                                max = temp;
                                maxIndex = tempIndex;
                            }
                        }

                    }
                    if (!(max == Integer.MIN_VALUE)) {
                        System.out.println(maxIndex);
                    } else {
                        System.out.println("No matches");
                    }
                }

            } else if (command.equals("min")) {
                String status = data[1];
                if (status.equals("even")) {
                    int min = Integer.MAX_VALUE;
                    int temp = 0;
                    int tempIndex = 0;
                    int minIndex = 0;
                    for (int i = 0; i < number.length; i++) {
                        if (number[i] % 2 == 0) {
                            temp = number[i];
                            tempIndex = i;
                            if (temp < min) {
                                min = temp;
                                minIndex = tempIndex;
                            }
                        }
                    }
                    if (!(min == Integer.MAX_VALUE)) {
                        System.out.println(minIndex);
                    } else {
                        System.out.println("No matches");
                    }
                } else {
                    int min = Integer.MAX_VALUE;
                    int temp = 0;
                    int tempIndex = 0;
                    int minIndex = 0;
                    for (int i = 0; i < number.length; i++) {
                        if (!(number[i] % 2 == 0)) {
                            tempIndex = i;
                            temp = number[i];
                            if (temp < min) {
                                min = temp;
                                minIndex = tempIndex;
                            }
                        }

                    }
                    if (!(min == Integer.MAX_VALUE)) {
                        System.out.println(minIndex);
                    } else {
                        System.out.println("No matches");
                    }
                }
            } else if (command.equals("first")) {
                int count = Integer.parseInt(data[1]);
                String status = data[2];
                if (count > number.length) {
                    System.out.println("Invalid count");
                } else {
                    if (status.equals("even")) {

                        String result = "";
                        int counter = 0;

                        for (int i = 0; i < number.length; i++) {
                            if (number[i] % 2 == 0) {
                                result += number[i] + " ";
                                counter++;
                                if (counter == count) {
                                    break;
                                }
                            }
                        }
                        if (counter == 0) {
                            System.out.println("[]");
                        } else {
                            String[] printResult = result.split(" ");
                            System.out.println(Arrays.toString(printResult));
                        }
                    } else {
                        String result = "";
                        int counter = 0;

                        for (int i = 0; i < number.length; i++) {
                            if (!(number[i] % 2 == 0)) {
                                result += number[i] + " ";
                                counter++;
                                if (counter == count) {
                                    break;
                                }
                            }
                        }
                        if (counter == 0) {
                            System.out.println("[]");
                        } else {
                            String[] printResult = result.split(" ");
                            System.out.println(Arrays.toString(printResult));
                        }
                    }
                }
            } else if (command.equals("last")) {
                int count = Integer.parseInt(data[1]);
                String status = data[2];
                if (count > number.length) {
                    System.out.println("invalid count");
                } else {
                    if (status.equals("even")) {

                        String result = "";
                        int counter = 0;

                        for (int i = number.length - 1; i >= 0; i--) {
                            if (number[i] % 2 == 0) {
                                result += number[i] + " ";
                                counter++;
                                if (counter == count) {
                                    break;
                                }
                            }
                        }
                        if (counter == 0) {
                            System.out.println("[]");
                        } else {
                            String[] printResult = result.split(" ");
                            System.out.println(Arrays.toString(printResult));
                        }
                    } else {
                        String result = "";
                        int counter = 0;

                        for (int i = number.length - 1; i >= 0; i--) {
                            if (!(number[i] % 2 == 0)) {
                                result += number[i] + " ";
                                counter++;
                                if (counter == count) {
                                    break;
                                }
                            }
                        }
                        if (counter == 0) {
                            System.out.println("[]");
                        } else {
                            String[] printResult = result.split(" ");
                            System.out.println(Arrays.toString(printResult));
                        }
                    }
                }


            }

        }
        System.out.println(Arrays.toString(number));
    }
}
