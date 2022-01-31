package br.com.lefranchi.hackerrank;

import java.util.List;

public class FlippingMatrix {

    public static int flippingMatrix(List<List<Integer>> matrix) throws Exception {

        if (matrix == null || matrix.isEmpty())
            throw new Exception("The matrix canot be null or empty");

        int n = matrix.size() / 2;
        int x = (2 * n);
        int s = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                int n1 = matrix.get(i).get(x - j - 1);
                int n2 = matrix.get(i).get(j);
                int n3 = matrix.get(x - i - 1).get(j);
                int n4 = matrix.get(x - i - 1).get(x - j - 1);

                s = s + Math.max(n1, Math.max(n2, Math.max(n3, n4)));

            }
        }

        return s;

    }

}
