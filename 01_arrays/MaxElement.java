public class MaxElement {

    public static void main(String[] args) {
        
        // Given array of integers
        int[] arr = {4, 2, 9, 1};

        // Assume the first element is the maximum initially
        int max = arr[0];
       
        // Loop starts from index 1 because index 0 is already assumed as max
        for (int i = 1; i < arr.length; i++) {

            // Compare current element with max
            if (arr[i] > max) {

                // Update max if current element is greater
                max = arr[i];
            }
        }

        // Print the maximum element found in the array
        System.out.println(max);
    }
}
