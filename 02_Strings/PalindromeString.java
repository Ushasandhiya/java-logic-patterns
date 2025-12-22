import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take string input from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        // Convert string to char array
        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        boolean isPalindrome = true;

        // Two-pointer comparison
        while (left < right) {

            if (arr[left] != arr[right]) {
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        // Output result
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}