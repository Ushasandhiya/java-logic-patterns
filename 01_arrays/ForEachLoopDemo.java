/*
 * Pattern: Enhanced For Loop (For-Each)
 * Concept: Arrays
 * Description: Traverse array elements without using index
 */

public class ForEachLoopDemo {

    public static void main(String[] args) {

        // Declare and initialize an array
        int[] arr = {10, 20, 30, 40};

        // Using for-each loop to traverse the array
        // 'num' will take each value from the array one by one
        for (int num : arr) {

            // Print the current element
            System.out.println(num);
        }
    }
}