import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOfProducts {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );


        int number = Integer.parseInt(reader.readLine());

        List<String> products = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            products.add(reader.readLine());
        }
            Collections.sort(products);

        for (int i = 0; i < products.size(); i++) {
            System.out.println(String.format("%d.%s" ,i + 1 , products.get(i)));
        }

    }
}
