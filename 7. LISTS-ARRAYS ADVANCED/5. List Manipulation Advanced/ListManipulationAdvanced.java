import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        List<Integer> numbers = Arrays.stream(reader.readLine().split(" "))
                .map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        String input = "";

        while (!"end".equals(input = reader.readLine())) {
            String[] data = input.split(" ");
            String command = data[0];

            if (command.equals("Contains")) {
                int n = Integer.parseInt(data[1]);

                if (numbers.contains(n)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (command.equals("Print")) {
                String condition = data[1];
                if (condition.equals("even")){
                    List<Integer> evenNumbers = new ArrayList<>();
                    for (int number : numbers) {
                        if (number % 2 == 0) {
                            evenNumbers.add(number);
                        }
                    }
                    System.out.println(evenNumbers
                            .toString()
                            .replaceAll("\\[|,|\\]", ""));
                } else {
                    List<Integer> oddNumbers = new ArrayList<>();
                    for (int number : numbers) {
                        if (!(number % 2 == 0)) {
                            oddNumbers.add(number);
                        }
                    }
                    System.out.println(oddNumbers
                            .toString()
                            .replaceAll("\\[|,|\\]", ""));
                }
            } else if (command.equals("Get")) {
                int sum = 0;
                for (int number : numbers) {
                    sum += number;
                }
                System.out.println(sum);
            } else if (command.equals("Filter")) {
                String condition = data[1];
                int n = Integer.parseInt(data[2]);
                String result = "";
                switch (condition) {
                    case "<":
                        for (int number : numbers) {
                            if (number < n) {
                                result += number + " ";
                            }
                        }
                        System.out.println(result.trim());
                        break;
                    case ">":
                        for (int number : numbers) {
                            if (number > n) {
                                result += number + " ";
                            }
                        }
                        System.out.println(result.trim());
                        break;
                    case "<=":
                        for (int number : numbers) {
                            if (number <= n) {
                                result += number + " ";
                            }
                        }
                        System.out.println(result.trim());
                        break;
                    case ">=":
                        for (int number : numbers) {
                            if (number >= n) {
                                result += number + " ";
                            }
                        }
                        System.out.println(result.trim());
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
