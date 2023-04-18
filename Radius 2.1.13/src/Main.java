public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

public static void calcCircleRadius(double area) {
    double radius = Math.sqrt(area / Math.PI);
    System.out.printf("%.3f", radius);
}
}