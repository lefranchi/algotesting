package br.com.lefranchi.algo.pangrams;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PangramsMainTest {

    @Test
    void positivePangram() {

        String s = "We promptly judged antique ivory buckles for the next prize";

        String retValue = PangramsMain.pangrams(s);

        assertEquals(retValue, PangramsMain.POSITIVE_RETURN_VALUE);

    }

    @Test
    void negativePangram() {

        String s = "Xu mptly judged antique ivory buckles for the next prize letter";

        String retValue = PangramsMain.pangrams(s);

        assertEquals(retValue, PangramsMain.NEGATIVE_RETURN_VALUE);

    }

    @Test
    void nullPangram() {

        String s = null;

        String retValue = PangramsMain.pangrams(s);

        assertEquals(retValue, PangramsMain.NEGATIVE_RETURN_VALUE);

    }

}
