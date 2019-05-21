package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergingList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        List<String> firstList = Arrays.stream(reader.readLine()
                .split(" "))
                .collect(Collectors.toList());
        List<String> secondList = Arrays.stream(reader.readLine()
                .split(" "))
                .collect(Collectors.toList());
        
        List<String> result = new ArrayList<>();
        
        if (firstList.size() > secondList.size()) {
            for (int i = 0; i < secondList.size(); i++) {
                result.add(firstList.get(i));
                result.add(secondList.get(i));
            }
            for (int i = secondList.size(); i < firstList.size(); i++) {
                result.add(firstList.get(i));
            }
        } else {
            for (int i = 0; i < firstList.size(); i++) {
                result.add(firstList.get(i));
                result.add(secondList.get(i));
            }
            for (int i = firstList.size(); i < secondList.size(); i++) {
                result.add(secondList.get(i));
            }
        }

        System.out.println(result.toString().replaceAll("\\[|,|\\]",""));
    }
}
