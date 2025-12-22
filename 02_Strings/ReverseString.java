public class ReverseString {

    public static void main(String[] args) {

        String str = "hello";

        // Step 1: convert string to char array
        char[] arr = str.toCharArray();

        // Step 2: two pointers
        int left = 0;
        int right = arr.length - 1;

        // Step 3: reverse using swap
        while (left < right) {

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        // Step 4: convert char array back to string
        String reversed = new String(arr);

        System.out.println(reversed);
    }
}