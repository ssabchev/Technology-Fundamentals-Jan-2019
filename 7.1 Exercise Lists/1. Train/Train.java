import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        System.in));


        List<Integer> trainWagons = Arrays.stream(reader.readLine().split(" "))
                .map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        int wagonCapacity = Integer.parseInt(reader.readLine());

        String input = "";

        while (!"end".equals(input = reader.readLine().toLowerCase())) {
            String[] data = input.split(" ");
            String command = data[0];

            if (command.equals("add")) {
                int passengers = Integer.parseInt(data[1]);
                trainWagons.add(passengers);
            } else {
                int passengersToAdd = Integer.parseInt(data[0]);

                for (int i = 0; i < trainWagons.size(); i++) {
                    if (trainWagons.get(i) + passengersToAdd <= wagonCapacity ) {
                        trainWagons.set(i , trainWagons.get(i) + passengersToAdd);
                        break;
                    }
                }
            }
        }
        String regex = "\\[|,|\\]";
        System.out.println(trainWagons.toString().replaceAll(regex , ""));
    }
}
