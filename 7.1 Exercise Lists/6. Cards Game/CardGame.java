import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CardGame {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );


        List<Integer> playerOne = Arrays.stream(reader.readLine().split("\\s+"))
                .map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        List<Integer> playerTwo = Arrays.stream(reader.readLine().split("\\s+"))
                .map(e -> Integer.parseInt(e)).collect(Collectors.toList());


        int playerOneCards = playerOne.size();
        int playerTwoCards = playerOne.size();


        while ((playerOneCards != 0) && (playerTwoCards != 0)){
            if (playerOne.get(0) == playerTwo.get(0)) {
                playerOne.remove(0);
                playerTwo.remove(0);
                playerOneCards--;
                playerTwoCards--;
            } else if (playerOne.get(0) > playerTwo.get(0)) {
                playerOne.add(playerOne.get(0));
                playerOne.remove(0);
                playerOne.add(playerTwo.get(0));
                playerTwo.remove(0);
                playerOneCards++;
                playerTwoCards--;
            } else {
                playerTwo.add(playerTwo.get(0));
                playerTwo.remove(0);
                playerTwo.add(playerOne.get(0));
                playerOne.remove(0);
                playerOneCards--;
                playerTwoCards++;
            }
        }

        int sum = 0;
        if (playerOneCards != 0) {
            for (Integer card : playerOne) {
                sum += card;
            }
            System.out.println(String.format("First player wins! Sum: %d", sum));
        } else {
            for (Integer card2 : playerTwo) {
                sum += card2;
            }
            System.out.println(String.format("Second player wins! Sum: %d", sum));
        }
    }
}
