import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        List<Integer> numbers = Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        for (int i = 0; i < numbers.size() / 2; i++) {
            numbers.set(i, (numbers.get(i) + numbers.get(numbers.size() - 1)));
            numbers.remove(numbers.size() - 1);

        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
