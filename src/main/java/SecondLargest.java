import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Teaching logic to my kid!
 */
public class SecondLargest {

    public static void main(String[] args) {

        int[] number = IntStream.generate(() -> new Random().nextInt(100)).limit(100).toArray();

        int testTimes = 100;
        int[] resultTime = new int[testTimes];

        System.out.println(Arrays.toString(number));

        for (int i = 0; i < testTimes; i++) {

            long linearTime = runLinear(number);

            long sortingTime = runWithSort(number);

            resultTime[i] = (int) (sortingTime / linearTime);

            System.out.println(String.format("%03d times.", resultTime[i]));

        }

        printAverage(resultTime);

    }

    private static long runWithSort(int[] numbers) {

        int[] numbersCopy = numbers.clone();

        long startTime = System.nanoTime();

        Arrays.sort(numbersCopy);

        int largestValue = numbersCopy[numbersCopy.length - 1];
        int secondLargestValue = numbersCopy[numbersCopy.length - 2];

        long endTime = System.nanoTime();

        long nanoTimeDiff = endTime - startTime;

        String messgaeInfo = String.format("Sorting: Largest %03d, Second Largest: %03d. Total time: %06d",
                largestValue, secondLargestValue, nanoTimeDiff);
        System.out.println(messgaeInfo);

        return nanoTimeDiff;

    }

    private static long runLinear(int[] numbers) {

        int[] numbersCopy = numbers.clone();

        int largestValue = 0;
        int secondLargestValue = 0;

        long startTime = System.nanoTime();

        for (int i : numbersCopy) {

            if (i > largestValue) {
                secondLargestValue = largestValue;
                largestValue = i;
            } else {
                secondLargestValue = i;
            }

        }

        long endTime = System.nanoTime();

        long nanoTimeDiff = endTime - startTime;

        String messgaeInfo = String.format("Linear: Largest %03d, Second Largest: %03d. Total time: %06d",
                largestValue, secondLargestValue, nanoTimeDiff);
        System.out.println(messgaeInfo);

        return nanoTimeDiff;

    }

    private static void printAverage(int[] numbers) {

        long total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total = total + numbers[i];
        }

        int average = (int) (total / numbers.length);

        System.out.format("The average is: %03d", average);

    }

}
