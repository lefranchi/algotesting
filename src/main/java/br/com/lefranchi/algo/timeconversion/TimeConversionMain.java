package br.com.lefranchi.algo.timeconversion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeConversionMain {

    public static void main(String[] args) throws ParseException {

        String s = "07:05:45PM";

        String result = timeConversion(s);

        System.out.println(result);

    }

    public static String timeConversion(String s) throws ParseException {

        SimpleDateFormat date12Format = new SimpleDateFormat("hh:mm:ssaa");

        SimpleDateFormat date24Format = new SimpleDateFormat("HH:mm:ss");

        return date24Format.format(date12Format.parse(s));
    }

}
