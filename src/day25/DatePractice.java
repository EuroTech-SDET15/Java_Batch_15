package day25;

import java.text.ParseException;
import java.text.SimpleDateFormat;


import java.util.Calendar;

import java.util.Date;
import java.util.TimeZone;

public class DatePractice {

    public static void main(String[] args) {

//        Date date= new Date();
//
//        System.out.println("date = " + date);

        // 2024-01-18 -  YYYY-MM-DD

//        Calendar cal = Calendar.getInstance();
//
//        cal.add(Calendar.DATE, 1);
//
//        Date date = cal.getTime();
//
//        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
//        format1.setTimeZone(TimeZone.getTimeZone("UTC"));
//
//        String inActiveDate = null;
//
//        inActiveDate = format1.format(date);
//
//        System.out.println(inActiveDate );


        Date date= new Date();
        System.out.println("date=  " + formatDateToString(date, "YYYY-MM-DD", "GMT"));

    }



    public static String formatDateToString(Date date, String format,
                                            String timeZone) {

        // create SimpleDateFormat object with input format
        SimpleDateFormat sdf = new SimpleDateFormat(format);

        // set timezone to SimpleDateFormat
        sdf.setTimeZone(TimeZone.getTimeZone(timeZone));
        // return Date in required format with timezone as String
        return sdf.format(date);
    }
}
