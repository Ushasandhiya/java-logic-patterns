import java.util.Scanner;

public class PalindromeIgnoreCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        // Step 1: convert to lowercase (ignore case)
        str = str.toLowerCase();

        // Step 2: convert string to char array
        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        boolean isPalindrome = true;

        // Step 3: two-pointer check
        while (left < right) {

            if (arr[left] != arr[right]) {
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        // Output
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}