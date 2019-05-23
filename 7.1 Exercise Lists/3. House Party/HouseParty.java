import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HouseParty {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        System.in));

        int num = Integer.parseInt(reader.readLine());

        List<String> guestList = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String[] data = reader.readLine().split(" ");

            String name = data[0];

            if (data.length == 3) {
                if (guestList.contains(name)) {
                    System.out.println(String.format("%s is already in the list!" , name ));
                } else {
                    guestList.add(name);
                }
            } else {
                if (guestList.contains(name)) {
                    guestList.remove(name);
                } else {
                    System.out.println(String.format("%s is not in the list!" , name));
                }
            }
        }
        for (String guest : guestList) {
            System.out.println(guest);
        }
    }
}
