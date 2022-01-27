package br.com.lefranchi.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Leandro Franchi
 */
public class DiagonalDifferenceTest {

    @Test
    void whenCorrectArrayUsed_thenAssertionSucceds() {

        List<List<Integer>> arr = Arrays.asList(Arrays.asList(11, 2, 4), Arrays.asList(4, 5, 6), Arrays.asList(10, 8, -12));

        assertEquals(DiagonalDifference.diagonalDifference(arr), 15);

    }

    @Test
    void whenNullParameterUsed_thenNullAssertionSucceeds() {

        assertEquals(DiagonalDifference.diagonalDifference(null), 0);

    }

}
