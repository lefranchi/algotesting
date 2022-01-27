package br.com.lefranchi.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * @author Leandro Franchi
 */
public class PlusMinusTest {

    @Test
    void whenCorrectArrayUsed_thenAssertionSucceds() {

        List<Integer> arr = Arrays.asList(-4, 3, -9, 0, 4, 1);

        PlusMinusDTO dto = PlusMinus.plusMinus(arr);

        assertEquals(dto.getPositiveRatio(), 0.500000);
        assertEquals(dto.getNegativeRatio(), 0.3333333432674408);
        assertEquals(dto.getZeroRatio(), 0.1666666716337204);

    }

    @Test
    void whenNullParameterUsed_thenNullAssertionSucceeds() {

        assertNull(PlusMinus.plusMinus(null));

    }

}
