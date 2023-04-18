import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    public static BigInteger factorial(int value) {
        BigInteger big = BigInteger.valueOf(value);
        if (value == 1 || value == 0) {
            return BigInteger.valueOf(1);
        }
        return big.multiply(factorial(value - 1));
    }
}