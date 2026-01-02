import java.util.Scanner;

public class FactorialFunction {

    // Method to calculate factorial
    int factorial(int num) {

        int fact = 1;   // Step 1: initialize factorial

        // Step 2: loop from 1 to num
        for (int i = 1; i <= num; i++) {
            fact = fact * i;   // multiply each time
        }

        // Step 3: return result
        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        // Create object to call non-static method
        FactorialFunction obj = new FactorialFunction();

        // Call factorial method
        int result = obj.factorial(n);

        // Print result
        System.out.println("Factorial = " + result);
    }
}