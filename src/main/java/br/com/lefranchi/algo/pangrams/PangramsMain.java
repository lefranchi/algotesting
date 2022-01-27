package br.com.lefranchi.algo.pangrams;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * A pangram is a string that contains every letter of the alphabet. Given a sentence determine whether
 * it is a pangram in the English alphabet. Ignore case. Return either pangram or not pangram as appropriate.
 *
 * @author Leandro Franchi
 */
public class PangramsMain {

    private static final int ALPHABET_COUNT = 26;
    static final String POSITIVE_RETURN_VALUE = "pangram";
    static final String NEGATIVE_RETURN_VALUE = "not pangram";

    public static void main(String[] args) {

        String s = "We promptly judged antique ivory buckles for the next prize";

        String retValue = pangrams(s);

        System.out.println(retValue);

    }

    public static String pangrams(String s) {

        if (s == null)
            s = "";

        Stream<Character> filteredCharStream = s.toUpperCase().chars()
                .filter(item -> ((item >= 'A' && item <= 'Z')))
                .mapToObj(c -> (char) c);

        Map<Character, Boolean> alphabetMap = filteredCharStream.collect(
                Collectors.toMap(item -> item, k -> Boolean.TRUE, (p1, p2) -> p1));

        return (alphabetMap.size() == ALPHABET_COUNT ? POSITIVE_RETURN_VALUE : NEGATIVE_RETURN_VALUE);
    }

}
