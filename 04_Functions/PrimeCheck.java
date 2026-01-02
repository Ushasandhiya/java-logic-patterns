import java.util.Scanner;

public class PrimeCheck {

    // Function to check prime
    static boolean isPrime(int num) {

        // 0 and 1 are NOT prime
        if (num <= 1) {
            return false;
        }

        // Check divisibility from 2 to num-1
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false; // divisible → not prime
            }
        }

        return true; // no divisors found → prime
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        sc.close();

        // Call function
        boolean result = isPrime(n);

        // Print result
        if (result) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}