package br.com.lefranchi.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * @author Leandro Franchi
 */
public class XORStrings2Test {

    @Test
    void whenCorrectStringsUsed_thenAssertionSucceds() {

        String a = "10101";
        String b = "00101";

        assertEquals(XORStrings2.stringsXOR(a, b), "10000");

    }

    @Test
    void whenNullParameterUsed_thenNullAssertionSucceeds() {

        assertNull(XORStrings2.stringsXOR(null, null));

    }

    @Test
    void whenDifferentSizeStringsParameterUsed_thenNullAssertionSucceeds() {

        assertNull(XORStrings2.stringsXOR("00001", "000010"));

    }

    @Test
    void whenEmptyStringsParameterUsed_thenNullAssertionSucceeds() {

        assertNull(XORStrings2.stringsXOR("", ""));

    }

    @Test
    void whenNoBinaryContentStringsParameterUsed_thenNullAssertionSucceeds() {

        assertNull(XORStrings2.stringsXOR("ABS", "TRW"));

    }

}
