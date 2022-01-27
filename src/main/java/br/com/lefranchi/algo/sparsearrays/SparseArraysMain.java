package br.com.lefranchi.algo.sparsearrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * There is a collection of input strings and a collection of query strings. For each query string, determine
 *  how many times it occurs in the list of input strings. Return an array of the results.
 *
 * @author Leandro Franchi
 */
public class SparseArraysMain {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("aba", "baba", "aba", "xzxb");
        List<String> queries = Arrays.asList("aba", "xzxb", "ab");

        List<Integer> retList = matchingStrings(strings, queries);

        retList.forEach(System.out::println);

    }

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {

        return queries.stream().map(q -> Collections.frequency(strings, q))
                .collect(Collectors.toList());

    }

}
