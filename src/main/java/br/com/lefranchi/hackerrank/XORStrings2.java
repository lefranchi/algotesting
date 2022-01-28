package br.com.lefranchi.hackerrank;

/**
 * Given two strings consisting of digits 0 and 1 only, find the XOR of the two strings.
 *
 * @author Leandro Franchi
 */
public class XORStrings2 {

    public static String stringsXOR(String s, String t) {

        if (s == null || s.isEmpty() || s.isBlank() || t == null || t.isEmpty() || t.isBlank())
            return null;

        if (s.length() != t.length())
            return null;

        String regex = "[01]+";
        if (!s.matches(regex) || !t.matches(regex))
            return null;

        StringBuilder sbReturn = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(i))
                sbReturn.append("0");
            else
                sbReturn.append("1");
        }

        return sbReturn.toString();
    }

}
