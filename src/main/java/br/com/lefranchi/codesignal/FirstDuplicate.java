package br.com.lefranchi.codesignal;

public class FirstDuplicate {

    public static void main(String[] args) {

        int[] a = {1, 1, 2, 2, 1};

        int ret = solution(a);

        System.out.println(ret);

    }

    static int solution(int[] a) {

        if (a.length == 0 || a.length > Math.pow(10, 5))
            return -1;

        int index = 0;
        int val = -1;

        for (int i = 0; i < a.length; i++) {

            int n = a[i];

            for (int j = i + 1; j < a.length; j++) {

                if ((n == a[j]) && (index == 0 || j < index)) {
                    index = j;
                    val = n;
                    break;
                }

            }

        }

        return val;

    }

}
