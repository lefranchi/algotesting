package br.com.lefranchi.hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Leandro Franchi
 */
public class PangramsTest {

    @Test
    void whenCorrectTextUsed_thenAssertionSucceds() {

        String s = "We promptly judged antique ivory buckles for the next prize";

        assertEquals(Pangrams.pangrams(s), Pangrams.POSITIVE_RETURN_VALUE);

    }

    @Test
    void whenIncorrectArrayUsed_thenAssertionSucceds() {

        String s = "Xu mptly judged antique ivory buckles for the next prize letter";

        assertEquals(Pangrams.pangrams(s), Pangrams.NEGATIVE_RETURN_VALUE);

    }

    @Test
    void whenNullParameterUsed_thenNullAssertionSucceeds() {

        assertEquals(Pangrams.pangrams(null), Pangrams.NEGATIVE_RETURN_VALUE);

    }

}
