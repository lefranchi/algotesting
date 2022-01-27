package br.com.lefranchi.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Leandro Franchi
 */
public class LonelyIntegerTest {

    @Test
    void whenCorrectArrayUsed_thenAssertionSucceds() {

        List<Integer> a = Arrays.asList(1, 2, 3, 4, 3, 2, 1);

        assertEquals(LonelyInteger.lonelyinteger(a), 4);

    }

    @Test
    void whenNullParameterUsed_thenNegativeOneAssertionSucceeds() {

        assertEquals(LonelyInteger.lonelyinteger(null), -1);

    }

}
