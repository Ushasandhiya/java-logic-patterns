public class EvenOddCount {

    public static void main(String[] args) {
        
        // Given array of numbers
        int[] arr = {4, 3, 2, 1};
        
        // Counter to store how many even numbers are present
        int evencount = 0;

        // Counter to store how many odd numbers are present
        int oddcount = 0;

        // Loop through each element of the array
        for (int i = 0; i < arr.length; i++) {

            // Check if the current element is even
            if (arr[i] % 2 == 0) {
                evencount++;   // increase even count
            } 
            // If not even, then it is odd
            else {
                oddcount++;    // increase odd count
            }
        }

        // Print total odd numbers
        System.out.println("oddcount = " + oddcount);

        // Print total even numbers
        System.out.println("evencount = " + evencount);
    }
}
