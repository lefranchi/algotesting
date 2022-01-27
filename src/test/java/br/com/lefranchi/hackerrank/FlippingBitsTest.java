package br.com.lefranchi.hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Leandro Franchi
 */
public class FlippingBitsTest {

    @Test
    void whenBigValueUsed_thenAssertionSucceds() {

        assertEquals(FlippingBits.flippingBits(2147483647), 2147483648L);

    }

    @Test
    void whenZeroValueUsed_thenAssertionSucceds() {

        assertEquals(FlippingBits.flippingBits(0), 4294967295L);

    }

    @Test
    void whenOneValueUsed_thenAssertionSucceds() {

        assertEquals(FlippingBits.flippingBits(1), 4294967294L);

    }

}
