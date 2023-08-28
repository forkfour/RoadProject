package com.lessons.tries.generics.datetime;

import java.time.LocalDateTime;
import java.util.Date;

public class ReturnLocalDateTime {
    public static void main(String[] args) {
        String str = "20.12.2022 20:16:00";
        System.out.println(returnLocalDateTime(str));

    }

    public static LocalDateTime returnLocalDateTime(String str){
        LocalDateTime parseDate = LocalDateTime.parse(str);
        return parseDate;
    }
}
