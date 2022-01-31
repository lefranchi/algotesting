package br.com.lefranchi.hackerrank;

import java.util.Comparator;
import java.util.List;

public class FindTheMedian {

    public static int findMedian(List<Integer> arr) throws Exception {

        if (arr == null || arr.isEmpty())
            throw new Exception("Param array canot be null or empty");

        if (arr.size() % 2 == 0)
            throw new Exception("The size of array have to be odd");

        int listSize = arr.size();
        int middleIndex = listSize / 2;

        arr.sort(Comparator.naturalOrder());

        return arr.get(middleIndex);

    }

}
