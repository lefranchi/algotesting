package br.com.lefranchi.hackerrank;

import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Leandro Franchi
 */
public class TimeConversionTest {

    @Test
    void whenCorrectTimeUsed_thenAssertionSucceds() {

        try {
            assertEquals(TimeConversion.timeConversion("07:05:45PM"), "19:05:45");
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    @Test
    void whenIncorrectTimeUsed_thenParseExceptionThrowed() {

        Exception exception = assertThrows(ParseException.class,
                () -> TimeConversion.timeConversion("97:0DSs5:45PMDDhs"));

    }

    @Test
    void whenNullParameterUsed_thenNullAssertionSucceeds() {

        try {
            assertNull(TimeConversion.timeConversion(null));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
