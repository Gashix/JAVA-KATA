import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(1));
    }

    public static BigInteger factorial(int value) {
        BigInteger big = BigInteger.valueOf(1);
        for (int i = 1; i <= value; i++) {
            BigInteger g = BigInteger.valueOf(i);
            big = big.multiply(g);
        }
        return big;
    }
}