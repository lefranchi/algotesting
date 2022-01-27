package br.com.lefranchi.algo.pangrams;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PangramsTest {

    @Test
    void positivePangram() {

        String s = "We promptly judged antique ivory buckles for the next prize";

        String retValue = Pangrams.pangrams(s);

        assertEquals(retValue, Pangrams.POSITIVE_RETURN_VALUE);

    }

    @Test
    void negativePangram() {

        String s = "Xu mptly judged antique ivory buckles for the next prize letter";

        String retValue = Pangrams.pangrams(s);

        assertEquals(retValue, Pangrams.NEGATIVE_RETURN_VALUE);

    }

    @Test
    void nullPangram() {

        String s = null;

        String retValue = Pangrams.pangrams(s);

        assertEquals(retValue, Pangrams.NEGATIVE_RETURN_VALUE);

    }

}
