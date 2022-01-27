package br.com.lefranchi.hackerrank;

/**
 * You will be given a list of 32 bit unsigned integers. Flip all the bits (1 -> 0 and 0 -> 1) and return
 * the result as an unsigned integer.
 *
 * @author Leandro Franchi
 */
public class FlippingBits {

    public static long flippingBits(long n) {

        long max = Integer.MAX_VALUE;
        max = max * 2 + 1;

        return ~n & max;

    }

}
