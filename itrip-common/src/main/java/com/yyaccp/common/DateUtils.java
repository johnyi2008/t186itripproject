package com.yyaccp.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static Date parseDate(String value, String fmt) {
        try {
            return new SimpleDateFormat(fmt).parse(value);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
