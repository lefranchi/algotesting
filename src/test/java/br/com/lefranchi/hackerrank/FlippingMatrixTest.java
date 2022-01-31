package br.com.lefranchi.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FlippingMatrixTest {

    @Test
    void whenCorrectArrayUsed_thenAssertionSucceds() {

        List<List<Integer>> matrix = Arrays.asList(Arrays.asList(112, 42, 83, 119), Arrays.asList(56, 125, 56, 49),
                Arrays.asList(15, 78, 101, 43), Arrays.asList(62, 98, 114, 108));

        try {
            assertEquals(FlippingMatrix.flippingMatrix(matrix), 414);
        } catch (Exception e) {
            e.printStackTrace();
            assert false;
        }

    }

    @Test
    void whenNullParameterUsed_thenExceptionAssertionSucceeds() {

        Exception exception = assertThrows(Exception.class,
                () -> FlippingMatrix.flippingMatrix(null));

    }

}
