public class FrequencyOfElements {

    public static void main(String[] args) {

        // Given array
        int[] arr = {1, 2, 2, 3, 1, 4};

        // Boolean array to mark visited elements
        boolean[] visited = new boolean[arr.length];

        // Outer loop to pick each element
        for (int i = 0; i < arr.length; i++) {

            // If this element is already counted, skip it
            if (visited[i]) {
                continue;
            }

            int count = 1; // Count current element itself

            // Inner loop to count frequency
            for (int j = i + 1; j < arr.length; j++) {

                // If same element found
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; // mark as visited
                }
            }

            // Print the element and its frequency
            System.out.println(arr[i] + " -> " + count + " times");
        }
    }
}