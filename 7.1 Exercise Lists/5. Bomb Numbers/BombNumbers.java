import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        List<Integer> numbers = Arrays.stream(reader.readLine().split("\\s+"))
                .map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        int[] data = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int powerNumber = data[0];
        int bombPower = data[1];

        for (int i = 0; i < numbers.size(); i++) {
            int index = 0;
            if (numbers.get(i).equals(powerNumber)) {
                index = i;
                if (index - bombPower < 0) {
                    for (int j = 0; j < index; j++) {
                        numbers.remove(0);
                    }
                    numbers.remove(index - bombPower);
                    if (index + bombPower < numbers.size()) {
                        for (int j = index - bombPower; j < numbers.size(); j++) {
                            numbers.remove(j);

                        }
                    }
                } else {

                        for (int j = index - bombPower; j < index + bombPower; j++) {
                            numbers.remove(j);
                            j--;
                        }

                }

            }
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);

    }
}
