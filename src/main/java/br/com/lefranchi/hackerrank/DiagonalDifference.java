package br.com.lefranchi.hackerrank;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 *
 * @author Leandro Franchi
 */
public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {

        if (arr == null)
            return 0;

        int n = arr.size();
        AtomicInteger d1 = new AtomicInteger(0);
        AtomicInteger d2 = new AtomicInteger(0);

        IntStream.range(0, n).forEach(i -> {
            d1.addAndGet(arr.get(i).get(i));
            d2.addAndGet(arr.get(i).get(n - 1 - i));
        });

        return Math.abs(d1.intValue() - d2.intValue());

    }

}
