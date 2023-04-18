import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] num = {3,5,4,2,8,1};
        int[] result = getArrayMiddle(num);
        int i = 0;
        while (i < result.length) {
            System.out.println(result[i]);
            i++;
        }

    }

    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers.length == 0) {
            int[] res = new int[]{};
            return res;
        }
        int index = numbers.length % 2;
        int of = (int) Math.floor((double) numbers.length / 2);
        int start = of - 1;
        int end = of + 1;
        int[] res;
        if (index == 0) {
            res = Arrays.copyOfRange(numbers, start, end);
        } else {
            res = Arrays.copyOfRange(numbers, start + 1, start + 2);
        }
        return res;
    }
}