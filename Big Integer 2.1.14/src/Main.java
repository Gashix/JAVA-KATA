import com.sun.jdi.Value;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        maxLongSqr();
    }


public static void maxLongSqr() {
    long maxValue = Long.MAX_VALUE;
    //BigInteger sqr = BigInteger.valueOf(2);
    BigInteger biggerInteger = BigInteger.valueOf(maxValue);
    BigInteger res = biggerInteger.multiply(biggerInteger);
    System.out.println(res);
}
}