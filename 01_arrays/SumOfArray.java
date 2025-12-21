public class SumOfArray {

    public static void main(String[] args) {
        
        // Given array of integers
        int[] arr = {4, 3, 2, 1};

        // Variable to store the total sum (accumulator)
        int sum = 0;
        
        // Index variable to traverse the array
        int i = 0;

        // Loop runs until all elements are added
        while (i < arr.length) {

            // Add current element to sum
            sum = sum + arr[i];

            // Move to the next index
            i++;
        }

        // Print the final sum of array elements
        System.out.println(sum);
    }
}
