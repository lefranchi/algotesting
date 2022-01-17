
public class SecondLargest {

    private final static int[] numbers = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412,
            393, 299, 343, 317, 265 , 999, 754};

    public static void main(String[] args) {

        int largestValue = 0;
        int secondLargestValue = 0;

        long startTime = System.currentTimeMillis();

        for (int i : numbers) {

            if (i > largestValue) {
                secondLargestValue = largestValue;
                largestValue = i;
            } else {
                secondLargestValue = i;
            }

        }

        long endTime = System.currentTimeMillis();

        long millisDiff = endTime - startTime;

        String messgaeInfo = String.format("Largest Value is: %03d, Seconda Largest is: %03d. Total time running: %06d",
                largestValue, secondLargestValue, millisDiff);
        System.out.println(messgaeInfo);

    }

}
