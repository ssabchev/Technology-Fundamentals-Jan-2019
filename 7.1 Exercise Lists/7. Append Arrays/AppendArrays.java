import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AppendArrays {

    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String[] data = reader.readLine().split("\\|");

        List<Character> result = new ArrayList<>();

        for (int i = data.length - 1; i >= 0; i--) {
            String text = data[i];
            for (int j = 0; j < text.length(); j++) {
               if (!(text.charAt(j) == ' ')) {
                   result.add(text.charAt(j));
               }
            }
        }

        System.out.println(result.toString()
                .replaceAll("\\[|,|\\]" , ""));
    }

}
