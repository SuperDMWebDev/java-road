package com.example.javaroad;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//@ApplicationPath("resources")
public class JavaRoadApplication {
    public static void main(String[] args) {
        Locale locale = new Locale("en","US");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT,locale);
        String date = dateFormat.format(new Date());
        System.out.println("date "+date);

        String pattern = "EEEEE MMMMM yyyy HH:mm:ss.SSSZ";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, new Locale("fr", "FR"));
        String date1 = simpleDateFormat.format(new Date());
        System.out.println(date1);
    }
}
