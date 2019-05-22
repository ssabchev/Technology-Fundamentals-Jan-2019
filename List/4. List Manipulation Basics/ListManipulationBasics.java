import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        List<String> numbers = Arrays.stream(reader.readLine()
                .split(" "))
                .collect(Collectors.toList());


        String input = "";

        while (!"end".equals(input = reader.readLine())) {
            String[] data = input.split(" ");

            String command = data[0];

            if (command.equals("Add")) {
                numbers.add(data[1]);
            } else if (command.equals("Remove")) {
                numbers.remove(data[1]);
            } else if (command.equals("RemoveAt")) {
                numbers.remove(1);
            } else if (command.equals("Insert")) {
                int index = Integer.parseInt(data[2]);
                numbers.add(index, data[1]);
            }
        }

        System.out.println(numbers.toString()
                .replaceAll("\\[|,|\\]", ""));

    }
}
