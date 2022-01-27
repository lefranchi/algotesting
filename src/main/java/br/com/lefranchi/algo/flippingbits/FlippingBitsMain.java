package br.com.lefranchi.algo.flippingbits;

import java.util.Arrays;
import java.util.List;

/**
 * You will be given a list of 32 bit unsigned integers. Flip all the bits (1 -> 0 and 0 -> 1) and return
 *  the result as an unsigned integer.
 *
 * @author Leandro Franchi
 */
public class FlippingBitsMain {

    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(2147483647, 1 , 0);

        for (Integer integer : a) {
            System.out.println(flippingBits(integer));
        }


    }

    public static long flippingBits(long n) {

        long max = Integer.MAX_VALUE;
        max = max * 2 + 1;

        return ~n & max;

    }

}
