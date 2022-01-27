package br.com.lefranchi.algo.countingsort1;

import java.util.Arrays;
import java.util.List;

/**
 * Quicksort usually has a running time of n x log(n), but is there an algorithm that can sort even faster? In general,
 * this is not possible. Most sorting algorithms are comparison sorts, i.e. they sort a list just by comparing
 * the elements to one another. A comparison sort algorithm cannot beat n x log(n) (worst-case) running time,
 * since n x log(n) represents the minimum number of comparisons needed to know where to place each element.
 *
 * @author Leandro Franchi
 */
public class CountingSort1Main {

    public static void main(String[] args) {

        //List<Integer> arr = Arrays.asList(1, 1, 3, 2, 1);
        List<Integer> arr = Arrays.asList(1, 1, 3, 2, 1);

        countingSort(arr).forEach(System.out::println);

    }

    public static List<Integer> countingSort(List<Integer> arr) {

        int n = arr.stream().mapToInt(x -> x).max().orElseGet(null);
        Integer[] resultArray = new Integer[n + 1];
        Arrays.fill(resultArray, 0);

        arr.forEach(i -> resultArray[i]++);

        return Arrays.asList(resultArray);

    }

}
