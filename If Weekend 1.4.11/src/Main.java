public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isWeekend(String weekday) {
        if (weekday == "Saturday" || weekday == "Sunday") {
            return true;
        }
        return false;
    }
}