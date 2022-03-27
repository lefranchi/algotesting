package br.com.lefranchi.codesignal;

public class RotateImage {

    public static void main(String[] args) {

        //int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] a = {{1, 2}, {3, 4}};

        int[][] m = solution(a);

        System.out.println(m);

    }

    static int[][] solution(int[][] a) {

        int[][] m = new int[a.length][a.length];

        for (int r = 0; r < a.length; r++) {

            for (int c = 0; c < a[0].length; c++) {

                int n = a[r][c];

                int destColumn = a[0].length - r - 1;

                m[c][destColumn] = n;

            }

        }

        return m;

    }

}
