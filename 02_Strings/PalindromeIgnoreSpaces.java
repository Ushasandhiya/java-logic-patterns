import java.util.Scanner;

public class PalindromeIgnoreSpaces {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        // Ignore case
        str = str.toLowerCase();

        // Ignore spaces
        str = str.replace(" ", "");

        // Convert to char array
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

        // Output
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}