package br.com.lefranchi.codesignal;

public class FirstNotRepeatingCharacter {

    char solution(String s) {

        if (s == null)
            return '_';

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            boolean dup = false;

            for (int j = 0; j < s.length(); j++) {

                if (i == j)
                    continue;

                char c2 = s.charAt(j);

                if (dup = (c1 == c2))
                    break;

            }

            if (!dup)
                return c1;

        }

        return '_';

    }

}
