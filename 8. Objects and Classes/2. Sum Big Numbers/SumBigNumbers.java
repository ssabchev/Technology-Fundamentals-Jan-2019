import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);

        BigInteger numberOne = scanner.nextBigInteger();
        BigInteger numberTwo = scanner.nextBigInteger();

        System.out.println(numberOne.add(numberTwo));

    }
}
