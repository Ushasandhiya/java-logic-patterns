public class IsSorted {

    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 4};

        // Assume the array is sorted initially
        boolean sorted = true;

        // Compare each element with the next one
        for (int i = 0; i < arr.length - 1; i++) {

            // If current element is greater than next, array is not sorted
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break; // no need to check further
            }
        }

        // Print result
        System.out.println(sorted);
    }
}