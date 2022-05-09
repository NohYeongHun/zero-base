package oop.classkinds.datetest;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTest{

    public static void main(String[] args) {
        
        Date today = Calendar.getInstance().getTime();
        System.out.println(today);

        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDate.format(today));

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(localDateTime.format(dateTimeFormatter));

        System.out.println(localDateTime
            .plusYears(1)
            .plusMonths(1)
            .plusDays(1)
            .format(dateTimeFormatter));
        
    }
}