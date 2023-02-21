package com.anz.wholesale.account.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.util.Objects.isNull;

public class DateUtil {
    public static LocalDateTime currentDateTime() {
        return LocalDateTime.now();
    }

    public static String getLocalDateTime(LocalDateTime now, String pattern) {
        if(isNull(now)){
            return null;
        }
        DateTimeFormatter format = DateTimeFormatter.ofPattern(pattern);
        return now.format(format);
    }

    public static String getLocalDate(LocalDate now, String pattern){
        if(isNull(now)){
            return null;
        }
        DateTimeFormatter format = DateTimeFormatter.ofPattern(pattern);
        return now.format(format);
    }
}
