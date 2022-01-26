package br.com.lefranchi.algo.sparsearrays;

import java.util.*;
import java.util.stream.Collectors;

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
