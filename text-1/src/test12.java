import java.util.Calendar;
import java.util.GregorianCalendar;

public class test12 {

    public static String findDay(int month, int day, int year) {
        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};

        return days[dayOfWeek - 1];
    }

    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();

        System.out.println(findDay(month, day, year));
    }
}
