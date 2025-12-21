public class ReverseArray {

    public static void main(String[] args) {

        // Given array to be reversed
        int[] arr = {10, 20, 30, 40};

        // 'left' starts from the first index
        int left = 0;

        // 'right' starts from the last index
        int right = arr.length - 1;

        // Loop runs until both pointers meet in the middle
        while (left < right) {

            // Store the left value temporarily
            int temp = arr[left];

            // Move right value to left position
            arr[left] = arr[right];

            // Put stored left value into right position
            arr[right] = temp;

            // Move left pointer forward
            left++;

            // Move right pointer backward
            right--;
        }

        // Print the reversed array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
