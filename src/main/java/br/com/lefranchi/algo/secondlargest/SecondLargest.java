package br.com.lefranchi.algo.secondlargest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import java.util.stream.IntStream;

/**
 * Teaching logic to my kid!
 */
public class SecondLargest {

    private static final Logger logger = LoggerFactory.getLogger((SecondLargest.class.getName()));

    public static void main(String[] args) throws InterruptedException {

        // Random array of numbers.
        int[] number = IntStream.generate(() -> new Random().nextInt(100)).limit(100).toArray();

        // How many times the logic will be executed to get agerage time.
        int testTimes = 10;

        // Create an array to store result times.
        int[] resultTime = new int[testTimes];

        // Show me the array!
        logger.info(Arrays.toString(number));

        // Running of....
        for (int i = 0; i < testTimes; i++) {

            // Execute linear logic.
            long linearTime = runLinear(number);

            // Execute Sorting Array Logic.
            long sortingTime = runWithSort(number);

            // Calculate how many times was fast.
            resultTime[i] = (int) (sortingTime / linearTime);

            // Show me plesase.
            logger.info(String.format("%03d times.", resultTime[i]));

            // Wait 1 second just to kid see what are happening...
            TimeUnit.SECONDS.sleep(1);

        }

        // Print average!
        printAverage(resultTime);

    }

    /**
     * This method will run using sort method (slower).
     *
     * @param numbers
     * @return
     */
    private static long runWithSort(int[] numbers) {

        // Create a copy of array to not change the original one.
        int[] numbersCopy = numbers.clone();

        // Start time.
        long startTime = System.nanoTime();

        // Sort array.
        Arrays.sort(numbersCopy);

        // Get largest value, last item of sorted array.
        int largestValue = numbersCopy[numbersCopy.length - 1];

        // Get second largest value, last last item of sorted array.
        int secondLargestValue = numbersCopy[numbersCopy.length - 2];

        // End time.
        long endTime = System.nanoTime();

        // Diff time.
        long nanoTimeDiff = endTime - startTime;

        // Log message please.
        String messgaeInfo = String.format("Sorting: Largest %03d, Second Largest: %03d. Total time: %06d",
                largestValue, secondLargestValue, nanoTimeDiff);
        logger.info(messgaeInfo);

        // Return diff time.
        return nanoTimeDiff;

    }

    /**
     * This methos will check values on linear way (fast).
     *
     * @param numbers
     * @return
     */
    private static long runLinear(int[] numbers) {

        // Create a copy of array to not change the original one.
        int[] numbersCopy = numbers.clone();

        // Will store largets value.
        int largestValue = 0;

        // Will store second largest value.
        int secondLargestValue = 0;

        // Start Time.
        long startTime = System.nanoTime();

        // Let's go...
        for (int i : numbersCopy) {

            // Get largest!
            if (i > largestValue) {
                // If current is the largets, last larget item now is second largest!
                secondLargestValue = largestValue;
                // Store new largest value.
                largestValue = i;
            }

        }

        // End time.
        long endTime = System.nanoTime();

        // Time diff.
        long nanoTimeDiff = endTime - startTime;

        // Show me!
        String messgaeInfo = String.format("Linear: Largest %03d, Second Largest: %03d. Total time: %06d",
                largestValue, secondLargestValue, nanoTimeDiff);
        logger.info(messgaeInfo);

        // Return diff time.
        return nanoTimeDiff;

    }

    /**
     * Calculate average of numbers in an array.
     *
     * @param numbers
     */
    private static void printAverage(int[] numbers) {

        long total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total = total + numbers[i];
        }

        int average = (int) (total / numbers.length);

        logger.info(String.format("The average is: %03d", average));

    }

}
