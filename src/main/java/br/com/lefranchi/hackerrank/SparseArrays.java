package br.com.lefranchi.hackerrank;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * There is a collection of input strings and a collection of query strings. For each query string, determine
 * how many times it occurs in the list of input strings. Return an array of the results.
 *
 * @author Leandro Franchi
 */
public class SparseArrays {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {

        if (strings == null || strings.isEmpty() || queries == null || queries.isEmpty())
            return null;

        return queries.stream().map(q -> Collections.frequency(strings, q))
                .collect(Collectors.toList());

    }

}
