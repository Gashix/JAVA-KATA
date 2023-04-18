public class Main {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));
    }

    public static boolean isPowerOfTwo(int n) {
        n = Math.abs(n);
        if (n == 1) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        while (n % 2 == 0) {
            n = n / 2;
            if (n == 1) {
                return true;
            }
        }
        return false;
    }

}