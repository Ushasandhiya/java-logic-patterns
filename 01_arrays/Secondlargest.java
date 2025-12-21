public class Secondlargest {

    public static void main(String[] args) {

        // Given array
        int[] arr = {4, 2, 9, 1};

        // Step 1: Find the maximum element
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Step 2: Initialize second maximum
        // Using Integer.MIN_VALUE ensures it works for negative numbers too
        int secondmax = Integer.MIN_VALUE;

        // Step 3: Find the second largest element
        for (int i = 0; i < arr.length; i++) {

            // Ignore the maximum element
            if (arr[i] != max) {

                // Update secondmax if current value is larger
                if (secondmax == Integer.MIN_VALUE || arr[i] > secondmax) {
                    secondmax = arr[i];
                }
            }
        }

        // Step 4: Print result
        System.out.println("Second largest = " + secondmax);
    }
}