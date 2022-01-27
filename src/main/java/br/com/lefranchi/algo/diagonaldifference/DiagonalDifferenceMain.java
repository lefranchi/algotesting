package br.com.lefranchi.algo.diagonaldifference;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 *
 * @author Leandro Franchi
 */
public class DiagonalDifferenceMain {

    public static void main(String[] args) {

        List<List<Integer>> arr = Arrays.asList(Arrays.asList(11, 2, 4), Arrays.asList(4, 5, 6), Arrays.asList(10, 8, -12));

        int n = arr.size();
        AtomicInteger d1 = new AtomicInteger(0);
        AtomicInteger d2 = new AtomicInteger(0);

        IntStream.range(0, n).forEach(i -> {
            d1.addAndGet(arr.get(i).get(i));
            d2.addAndGet(arr.get(i).get(n - 1 - i));
        });

        int diff = Math.abs(d1.intValue() - d2.intValue());

        System.out.println(diff);

    }

}
