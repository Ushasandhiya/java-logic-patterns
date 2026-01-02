/*
 * Pattern: Object Initialization
 * Concept: Constructor
 * Description: Constructor initializes object values at creation time
 */

public class Student {

    int id;
    String name;

    // Constructor
    Student(int i, String n) {
        id = i;
        name = n;
    }

    public static void main(String[] args) {

        // Object creation
        // Constructor is automatically called here
        Student s1 = new Student(1, "Alex");

        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}