public class MaxOfTwoFunction {

    // This method takes two numbers and RETURNS the larger one
    int findMax(int num1, int num2) {

        // Compare the two numbers
        if (num1 > num2) {
            // If num1 is greater, return num1
            return num1;
        } else {
            // Otherwise, return num2
            return num2;
        }
    }

    public static void main(String[] args) {

        // Create an object of the class
        MaxOfTwoFunction obj = new MaxOfTwoFunction();

        // Call the method and store the returned value
        int result = obj.findMax(50, 60);

        // Print the result
        System.out.println(result);
    }
}