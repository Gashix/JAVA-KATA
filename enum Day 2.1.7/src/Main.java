public class Main {
    public static void main(String[] args) {
        Day monday = Day.MONDAY;
        Day sunday = Day.SUNDAY;

        System.out.println(sunday.getRusName());
        System.out.println(sunday.isWeekend());
    }

    public enum Day {
        MONDAY("Понедельник"), TUESDAY("Вторник"), WEDNESDAY("Среда"), THURSDAY("Четверг"),
        FRIDAY("Пятница"), SATURDAY("Суббота"), SUNDAY("Воскресенье");

        private String title;

        private Day(String title) {
            this.title = title;
        }

        public boolean isWeekend() {
            return this == SATURDAY || this == SUNDAY;
        }

        public String getRusName() {
            return this.title;
        }
    }


}