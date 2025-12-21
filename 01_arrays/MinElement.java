public class MinElement {

    public static void main(String[] args) {
        
        // Given array of integers
        int[] arr = {4, 5, 2, 3, 1};

        // Assume the first element is the minimum initially
        int min = arr[0];

        // Loop starts from index 1 because index 0 is already assumed as min
        for (int i = 1; i < arr.length; i++) {

            // Compare current element with min
            if (arr[i] < min) {

                // Update min if current element is smaller
                min = arr[i];
            }
        }

        // Print the minimum element found in the array
        System.out.println(min);
    }
}
