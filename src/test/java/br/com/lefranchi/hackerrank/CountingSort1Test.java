package br.com.lefranchi.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Leandro Franchi
 */
public class CountingSort1Test {

    @Test
    void whenCorrectArrayUsed_thenAssertionSucceds() {

        List<Integer> arr = Arrays.asList(1, 1, 3, 2, 1);

        List<Integer> retList = CountingSort1.countingSort(arr);

        List<Integer> desiredReturn = Arrays.asList(0, 3, 1, 1);

        assertEquals(retList, desiredReturn);

    }

    @Test
    void whenNullParameterUsed_thenNullAssertionSucceeds() {

        List<Integer> desiredReturnList = new ArrayList<>();

        assertEquals(CountingSort1.countingSort(null), desiredReturnList);

    }

}