package br.com.lefranchi.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * @author Leandro Franchi
 */
public class MinMaxSumTest {

    @Test
    void whenCorrectArrayUsed_thenAssertionSucceds() {

        List<Integer> arr = Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625);

        assertEquals(MinMaxSum.miniMaxSum(arr), "2063136757 2744467344");

    }

    @Test
    void whenNullParameterUsed_thenNullAssertionSucceeds() {

        assertNull(MinMaxSum.miniMaxSum(null));

    }


}
