package dec30;

import java.util.Arrays;

public class Secon_smallest_array {
    public static void main(String[] args) {
        int[] arr = {10, 3, 20, 5, 6}; // Example array

        // Sort the array using Bubble Sort (or use Arrays.sort(arr))
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // The second smallest number will be at index 1 after sorting
        System.out.println("Second smallest number is: " + arr[1]);
    }
}
