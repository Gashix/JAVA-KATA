import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {6,-3,25,4,87,101,2,8};
        printOddNumbers(arr);
    }

    public static void printOddNumbers(int[] arr) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                if (result.length() > 0) {
                    result.append(",");
                }
                result.append(arr[i]);
            }
        }
        System.out.println(result);
    }

}