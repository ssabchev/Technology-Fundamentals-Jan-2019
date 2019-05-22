import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNegativeAndReverse {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        List<Integer> numbers = Arrays.stream(reader.readLine().split("\\s+"))
                .map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        List<Integer> result = positiveNumbers(numbers);

        System.out.println(reversedOrder(result).trim());


    }

    public static List<Integer> positiveNumbers(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > 0) {
                result.add(numbers.get(i));
            }
        }
        return result;
    }

    public static String reversedOrder(List<Integer> result) {
        String resultToPrint = "";
        if (result.size() == 0) {
            resultToPrint = "empty";
            return resultToPrint;
        } else {
            for (int i = result.size() - 1; i >= 0; i--) {
                resultToPrint += result.get(i) + " ";
            }
        }
        return resultToPrint;
    }
}

