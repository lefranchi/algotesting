package br.com.lefranchi.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * @author Leandro Franchi
 */
public class SparseArraysTest {

    @Test
    void whenCorrectArrayUsed_thenAssertionSucceds() {

        List<String> strings = Arrays.asList("aba", "baba", "aba", "xzxb");
        List<String> queries = Arrays.asList("aba", "xzxb", "ab");

        List<Integer> retList = SparseArrays.matchingStrings(strings, queries);

        List<Integer> desiredRetList = Arrays.asList(2, 1, 0);

        assertEquals(retList, desiredRetList);

    }

    @Test
    void whenNullParameterUsed_thenNullAssertionSucceeds() {

        assertNull(MinMaxSum.miniMaxSum(null));

    }

}
