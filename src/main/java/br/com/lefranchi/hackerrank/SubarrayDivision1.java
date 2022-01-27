package br.com.lefranchi.hackerrank;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.
 * Lily decides to share a contiguous segment of the bar selected such that:
 * The length of the segment matches Ron's birth month, and,
 * The sum of the integers on the squares is equal to his birth day.
 * Determine how many ways she can divide the chocolate.
 *
 * @author Leandro Franchi
 */
public class SubarrayDivision1 {

    public static int birthday(List<Integer> s, int d, int m) {

        if (s == null || s.isEmpty() || d <= 0 || m <= 0)
            return 0;

        AtomicInteger numberOfPieces = new AtomicInteger(0);

        for (int i = 0; i < s.size(); i++) {

            int sumValue = s.stream().skip(i).limit(m).mapToInt(v -> v).sum();

            if (sumValue == d)
                numberOfPieces.incrementAndGet();

        }

        return numberOfPieces.intValue();

    }

}
