package br.com.lefranchi.hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * There are two n-element arrays of integers, A and B. Permute them into some A' and B' such that the relation
 * A'[i] + B'[i] >= k holds for all i where 0 <= i < n.
 * There will be q queries consisting of A, B, and k. For each query, return YES if some permutation A', B'
 * satisfying the relation exists. Otherwise, return NO.
 *
 * @author Leandro Franchi
 */
public class PermutingTwoArrays {

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {

        if (k < 0 || A == null || A.isEmpty() || B == null || B.isEmpty())
            return null;

        A.sort(Collections.reverseOrder());

        B.sort(Comparator.naturalOrder());

        for (int i = 0; i < A.size(); i++)
            if (A.get(i) + B.get(i) < k)
                return "NO";

        return "YES";
    }

}
