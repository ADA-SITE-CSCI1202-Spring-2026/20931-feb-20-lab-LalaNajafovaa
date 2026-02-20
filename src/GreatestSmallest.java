package src;

import java.util.Arrays;
import java.util.Scanner;

public class GreatestSmallest {

    public static void main(String[] args) {

        if (args.length > 0) {
            int[] cmdArray = parseArguments(args);
            System.out.println("Command Line Input: " + Arrays.toString(cmdArray));
            processArray(cmdArray);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array must contain at least one element.");
            return;
        }

        int[] scanArray = new int[n];
        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            scanArray[i] = scanner.nextInt();
        }

        System.out.println("Scanner Input: " + Arrays.toString(scanArray));
        processArray(scanArray);
    }

    public static int[] parseArguments(String[] args) {
        int[] array = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }
        return array;
    }

    public static void processArray(int[] array) {
        System.out.println("Minimum: " + findMin(array));
        System.out.println("Maximum: " + findMax(array));
        int[] minMax = findMinMax(array);
        System.out.println("Min & Max (together): " + Arrays.toString(minMax));
        System.out.println("-------------------------");
    }

    public static int findMin(int[] array) {
        validateArray(array);
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        validateArray(array);
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int[] findMinMax(int[] array) {
        validateArray(array);
        int min = array[0];
        int max = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            } else if (value > max) {
                max = value;
            }
        }
        return new int[]{min, max};
    }

    private static void validateArray(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }
    }
}
