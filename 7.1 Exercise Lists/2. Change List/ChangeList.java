import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        System.in));

        List<Integer> numbers = Arrays.stream(reader.readLine().split("\\s+"))
                .map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        String input = "";

        while (!"end".equals(input = reader.readLine())) {
            String[] data = input.split("\\s+");
            String command = data[0];

            if (command.equals("Delete")) {
                int elementToDelete = Integer.parseInt(data[1]);
                
//                Another way to sort
//                numbers = numbers.stream().filter(e -> !e.equals(data[1]))
//                        .collect(Collectors.toList());

                List<Integer> temp = new ArrayList<>();
                for (int i = 0; i < numbers.size(); i++) {
                    if (!(numbers.get(i) == elementToDelete)) {
                        temp.add(numbers.get(i));
                    }
                }
                numbers = temp;
            } else if (command.equals("Insert")) {
                int elementToInsert = Integer.parseInt(data[1]);
                int index = Integer.parseInt(data[2]);
                if (index >= 0 && index < numbers.size()) {
                    numbers.add(index, elementToInsert);
                }
            }
        }
        System.out.println(numbers.toString()
                .replaceAll("\\[|,|\\]", ""));
    }
}
