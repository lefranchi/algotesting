package br.com.lefranchi.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindTheMedianTest {

    @Test
    void whenCorrectArrayUsed_thenAssertionSucceds() {

        List<Integer> a = Arrays.asList(0, 1, 2, 4, 6, 5, 3);

        try {
            assertEquals(FindTheMedian.findMedian(a), 3);
        } catch (Exception e) {
            e.printStackTrace();
            assert false;
        }

    }

    @Test
    void whenNullParameterUsed_thenExceptionAssertionSucceeds() {

        Exception exception = assertThrows(Exception.class,
                () -> FindTheMedian.findMedian(null));

    }

    @Test
    void whenEvenSizeListParameterUsed_thenExceptionAssertionSucceeds() {

        List<Integer> a = Arrays.asList(0, 1, 2, 4);

        Exception exception = assertThrows(Exception.class,
                () -> FindTheMedian.findMedian(null));

    }

}
