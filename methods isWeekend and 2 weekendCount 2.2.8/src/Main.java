public class Main {
    public static void main(String[] args) {
        String[] str = new String[]{"Sunday", "Sunday","Saturday", "Monday"};
        System.out.println(weekdayCount(str));
    }

public static boolean isWeekend(String dayName) {
    return dayName.equals("Sunday") || dayName.equals("Saturday");
}

public static int weekendCount(String[] days) {
    int count = 0;

    for (String day : days) {
        if (isWeekend(day)) {
            count++;
        }
    }
    return count;
}

public static int weekdayCount(String[] days) {
    int count = 0;
    for (String day : days) {
        if (!isWeekend(day)) {
            count++;
        }
    }
    return count;
}
}