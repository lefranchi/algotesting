package br.com.lefranchi.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * @author Leandro Franchi
 */
public class PermutingTwoArraysTest {

    @Test
    void whenCorrectArraysUsed_thenAssertionSucceds() {

        int k = 1;
        List<Integer> A = Arrays.asList(0, 1);
        List<Integer> B = Arrays.asList(0, 2);

        assertEquals(PermutingTwoArrays.twoArrays(k, A, B), "YES");

    }

    @Test
    void whenIncorrectArraysUsed_thenAssertionSucceds() {

        int k = 5;
        List<Integer> A = Arrays.asList(1, 2, 2, 1);
        List<Integer> B = Arrays.asList(3, 3, 3, 4);

        assertEquals(PermutingTwoArrays.twoArrays(k, A, B), "NO");

    }

    @Test
    void whenNullParameterUsed_thenNullAssertionSucceeds() {

        assertNull(PermutingTwoArrays.twoArrays(-1, null, null));

    }

}
