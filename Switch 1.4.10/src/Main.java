public class Main {
    public static void main(String[] args) {
        System.out.println(isWeekend("Saturday"));
    }

    public static boolean isWeekend(String weekday) {
        switch (weekday) {
            case "Saturday":
            case "Sunday":
                return true;
        }
        return false;
    }
}