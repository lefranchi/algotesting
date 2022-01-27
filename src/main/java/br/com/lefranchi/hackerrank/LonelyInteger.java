package br.com.lefranchi.hackerrank;

import java.util.Collections;
import java.util.List;

/**
 * Given an array of integers, where all elements but one occur twice, find the unique element.
 *
 * @author Leandro Franchi
 */
public class LonelyInteger {

    public static int lonelyinteger(List<Integer> a) {

        if (a == null)
            return -1;

        return a.stream().filter(v -> Collections.frequency(a, v) == 1).toList().get(0);

    }

}
