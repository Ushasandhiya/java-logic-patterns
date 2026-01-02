/*
 * Concept: Method Overloading
 * Same method name with different parameters
 * Decided at compile time
 */

public class MethodOverloadingDemo {

    // Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Add three integers (overloaded method)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two double values (overloaded method)
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        MethodOverloadingDemo obj = new MethodOverloadingDemo();

        System.out.println(obj.add(2, 3));        // calls add(int, int)
        System.out.println(obj.add(2, 3, 4));     // calls add(int, int, int)
        System.out.println(obj.add(2.5, 3.5));    // calls add(double, double)
    }
}