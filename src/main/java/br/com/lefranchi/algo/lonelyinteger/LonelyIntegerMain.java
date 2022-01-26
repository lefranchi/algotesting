package br.com.lefranchi.algo.lonelyinteger;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LonelyIntegerMain {

    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(1, 2, 3, 4, 3, 2, 1);

        System.out.println(lonelyinteger(a));

    }

    public static int lonelyinteger(List<Integer> a) {

        return a.stream().filter(v -> Collections.frequency(a, v) == 1).toList().get(0);

    }

}
