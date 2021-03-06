package br.com.lefranchi.hackerrank;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.
 *
 * @author Leandro Franchi
 */
public class TimeConversion {

    public static String timeConversion(String s) throws ParseException {

        if (s == null || s.isEmpty() || s.isBlank())
            return null;

        SimpleDateFormat date12Format = new SimpleDateFormat("hh:mm:ssaa");

        SimpleDateFormat date24Format = new SimpleDateFormat("HH:mm:ss");

        return date24Format.format(date12Format.parse(s));

    }

}
