public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

public static boolean doubleExpression(double a, double b, double c) {
    if (Math.abs(a + b - c) < 0.0001) {
        return true;
    } else {
        return false;
    }
}
}