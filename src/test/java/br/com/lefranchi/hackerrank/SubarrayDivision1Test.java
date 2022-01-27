package br.com.lefranchi.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Leandro Franchi
 */
public class SubarrayDivision1Test {

    @Test
    void whenCorrectParametersUsed_thenAssertionSucceds() {

        List<Integer> s = Arrays.asList(2, 2, 1, 3, 2);
        int d = 4;
        int m = 2;

        assertEquals(SubarrayDivision1.birthday(s, d, m), 2);

    }

    @Test
    void whenNullParameterUsed_thenNullAssertionSucceeds() {

        assertEquals(SubarrayDivision1.birthday(null, 0, 0), 0);

    }

}
