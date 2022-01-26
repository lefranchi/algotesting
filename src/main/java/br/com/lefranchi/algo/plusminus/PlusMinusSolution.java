package br.com.lefranchi.algo.plusminus;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class PlusMinusSolution {

    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(-4, 3, -9, 0, 4, 1);

        Result.plusMinus(arr);

    }

}


class Result {

    public static void plusMinus(List<Integer> arr) {

        long n = arr.size();
        long positiveCount = arr.stream().filter(x -> x > 0).count();
        long negetiveCount = arr.stream().filter(x -> x < 0).count();
        long zeroCount = arr.stream().filter(x -> x == 0).count();

        float positiveRatio = (float) positiveCount / n;
        float negativeRatio = (float) negetiveCount / n;
        float zeroRatio = (float) zeroCount / n;

        System.out.printf("%.6f \n", positiveRatio);
        System.out.printf("%.6f \n", negativeRatio);
        System.out.printf("%.6f", zeroRatio);

    }

}