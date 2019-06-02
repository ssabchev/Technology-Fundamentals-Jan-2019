import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        List<String> text = Arrays.stream(reader.readLine()
                .split("\\s+")).collect(Collectors.toList());

        Random random = new Random();
        int lenght = text.size();

        while (lenght > 0) {
            int number = random.nextInt(text.size());
            System.out.println(text.get(number));
            text.remove(number);
            lenght--;
        }

    }
}
