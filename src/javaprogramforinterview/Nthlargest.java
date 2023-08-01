package javaprogramforinterview;

import java.util.Arrays;

public class Nthlargest {

    public static int findNthLargestElement(int[] arr, int n) {
        // Sort the array in ascending order
        Arrays.sort(arr);

        // Return the nth largest element
        return arr[arr.length - n];
    }

    public static void main(String[] args) {
        int[] arr = { 3, 9, 1, 7, 5 };
        int n = 2; // Find the 2nd largest element

        int nthLargest = findNthLargestElement(arr, n);
        System.out.println("The " + n + "th largest element is: " + nthLargest);
    }
}





