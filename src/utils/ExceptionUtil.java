package utils;

import static utils.PublicStaticFinals.NEW_LINE;

public class ExceptionUtil {

    public static void printEx(Exception ex) {
        System.out.println(ex + NEW_LINE);
        for (StackTraceElement ste : ex.getStackTrace()) {
            System.out.println(ste + NEW_LINE);
        }
    }
}
