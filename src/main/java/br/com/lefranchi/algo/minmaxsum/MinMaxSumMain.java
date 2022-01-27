package br.com.lefranchi.algo.minmaxsum;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly
 *  four of the five integers. Then print the respective minimum and maximum values as a single line of two
 *  space-separated long integers.
 *
 * @author Leandro Franchi
 */
public class MinMaxSumMain {

    public static void main(String[] args) {

        //List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        //List<Integer> arr = Arrays.asList(7, 69, 2, 221, 8974);
        List<Integer> arr = Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625);

        miniMaxSum(arr);

    }

    public static void miniMaxSum(List<Integer> arr) {

        arr.sort(Comparator.naturalOrder());
        long sumMin = arr.stream().limit(4).map(Long::valueOf).reduce(0L, Long::sum);
        long sumMax = arr.stream().skip(1).map(Long::valueOf).reduce(0L, Long::sum);

        System.out.println(sumMin + " " + sumMax);


    }

}
