import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        System.in));

        List<String> elements = Arrays.stream(reader.readLine().split("\\s+"))
                .collect(Collectors.toList());

        String input = "";

        while (!"end".equals(input = reader.readLine().toLowerCase())) {
            String[] data = input.split("\\s+");

            String command = data[0];

            switch (command) {
                case "Add" :
                    elements.add((data[1]));
                    break;

                case "Insert":
                    String  element = data[1];
                    int index = Integer.parseInt(data[2]);

                    if (index >= 0 && index < elements.size()) {
                        elements.add(index, element);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

                case "Remove":
                    int indexToRemove = Integer.parseInt(data[1]);
                    if (indexToRemove >= 0 && indexToRemove < elements.size()) {
                        elements.remove(indexToRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

                case "Shift":

                    int count = Integer.parseInt(data[2]);

                    if (data[1].equals("left")) {
                        for (int i = 0; i < count; i++) {
                            elements.add(elements.get(0));
                            elements.remove(0);
                        }
                    } else {
                        for (int i = 0; i < count; i++) {
                            elements.add(0,
                                    elements.get(elements.size() - 1));
                            elements.remove(elements.size() - 1);
                        }
                    }
                    break;
            }

        }

        System.out.println(elements.toString().replaceAll("[\\[,\\]]", ""));
    }
}
