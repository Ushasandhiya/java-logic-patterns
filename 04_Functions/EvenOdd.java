import java.util.Scanner;

public class EvenOdd {

    // Function that checks if a number is even
    // It RETURNS true or false
    static boolean isEven(int num) {

        if (num % 2 == 0) {
            return true;   // even
        } else {
            return false;  // odd
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        sc.close();

        // Call the function
        boolean result = isEven(n);

        // Decide what to print
        if (result) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}