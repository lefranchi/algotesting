package br.com.lefranchi.hackerrank;

import java.util.Comparator;
import java.util.List;

/**
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly
 * four of the five integers. Then print the respective minimum and maximum values as a single line of two
 * space-separated long integers.
 *
 * @author Leandro Franchi
 */
public class MinMaxSum {

    public static String miniMaxSum(List<Integer> arr) {

        if (arr == null)
            return null;

        arr.sort(Comparator.naturalOrder());
        long sumMin = arr.stream().limit(4).map(Long::valueOf).reduce(0L, Long::sum);
        long sumMax = arr.stream().skip(1).map(Long::valueOf).reduce(0L, Long::sum);

        return sumMin + " " + sumMax;


    }

}
