package br.com.lefranchi.hackerrank;

import java.util.List;

/**
 * Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the
 * decimal value of each fraction on a new line with places after the decimal.
 *
 * @author Leandro Franchi
 */
public class PlusMinus {

    public static PlusMinusDTO plusMinus(List<Integer> arr) {

        if (arr == null)
            return null;

        long n = arr.size();
        long positiveCount = arr.stream().filter(x -> x > 0).count();
        long negetiveCount = arr.stream().filter(x -> x < 0).count();
        long zeroCount = arr.stream().filter(x -> x == 0).count();

        PlusMinusDTO dto = new PlusMinusDTO();
        dto.setPositiveRatio((float) positiveCount / n);
        dto.setNegativeRatio((float) negetiveCount / n);
        dto.setZeroRatio((float) zeroCount / n);

        return dto;
    }

}

class PlusMinusDTO {

    private float positiveRatio;
    private float negativeRatio;
    private float zeroRatio;

    public float getPositiveRatio() {
        return positiveRatio;
    }

    public void setPositiveRatio(float positiveRatio) {
        this.positiveRatio = positiveRatio;
    }

    public float getNegativeRatio() {
        return negativeRatio;
    }

    public void setNegativeRatio(float negativeRatio) {
        this.negativeRatio = negativeRatio;
    }

    public float getZeroRatio() {
        return zeroRatio;
    }

    public void setZeroRatio(float zeroRatio) {
        this.zeroRatio = zeroRatio;
    }
}
