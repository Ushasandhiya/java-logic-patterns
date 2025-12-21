public class SecondSmallest {

    public static void main(String[] args) {

        // Given array
        int[] arr = {4, 2, 9, 1};

        // Step 1: Find the minimum element
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Step 2: Initialize second minimum
        // Using Integer.MAX_VALUE ensures correctness for all inputs
        int secondmin = Integer.MAX_VALUE;

        // Step 3: Find the second smallest element
        for (int i = 0; i < arr.length; i++) {

            // Ignore the minimum element
            if (arr[i] != min) {

                // Update secondmin if current value is smaller
                if (secondmin == Integer.MAX_VALUE || arr[i] < secondmin) {
                    secondmin = arr[i];
                }
            }
        }

        // Print result
        System.out.println("Second smallest = " + secondmin);
    }
}