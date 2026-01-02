/*
 * Pattern: Single Inheritance
 * Concept: Inheritance
 * Structure:
 * Parent
 *   |
 * Child
 */

class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {

        // Creating object of child class
        Dog d = new Dog();

        // Calling inherited method
        d.eat();

        // Calling child class method
        d.bark();
    }
}