package com.example.springcustomvalidator.utils;

import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class Utils {

    public final static String DATE_FORMAT = "dd-MM-yyyy HH:mm:ss";
    public final static DateTimeFormatter FORMATTER = DateTimeFormatter
            .ofPattern(DATE_FORMAT)
            .withZone(ZoneId.from(ZoneOffset.UTC));

    public static boolean validateDateFormat(String sDate) {
        try {
            LocalDateTime.from(FORMATTER.parse(sDate));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static LocalDateTime stringToInstant(String strDate) {
        if (StringUtils.isEmpty(strDate)) {
            return null;
        }
        return LocalDateTime.from(FORMATTER.parse(strDate));
    }

    public static String instantToString(LocalDateTime instant) {
        if (instant == null) {
            return null;
        }
        return FORMATTER.format(instant);
    }

    public static Long stringToLong(String v) {
        try {
            return Long.parseLong(v);
        } catch (NumberFormatException e) {
            return null;
        }
    }

}
