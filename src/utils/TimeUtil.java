package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public final class TimeUtil {

    public static boolean isValidDateOrder(String startDate, String endDate) {
        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("yyyy-MM-dd", Locale.ENGLISH);
        LocalDate start = LocalDate.parse(startDate, formatter);
        LocalDate end = LocalDate.parse(endDate, formatter);
        return end.isAfter(start);
    }

    public static boolean isValidDateOrder(Date startDate, Date endDate) {
        return endDate.after(startDate);
    }
}
