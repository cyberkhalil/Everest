package utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class DateUtil {

    private DateUtil() {
    }

    public static String getDate(int day, int month, int year) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        int dayx = day;
        int monthx = month;
        int yearx = year;
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, yearx);
        cal.set(Calendar.MONTH, monthx - 1); // <-- months start
        // at 0.
        cal.set(Calendar.DAY_OF_MONTH, dayx);

        java.sql.Date date = new java.sql.Date(cal.getTimeInMillis());
        return sdf.format(date);
    }

}
