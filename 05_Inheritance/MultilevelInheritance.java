/*
 * Pattern: Multilevel Inheritance
 * Concept: Inheritance
 * Structure:
 * Grandparent
 *     |
 *   Parent
 *     |
 *   Child
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

class BabyDog extends Dog {
    void weep() {
        System.out.println("Baby dog weeps");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {

        // Creating object of bottom-most class
        BabyDog bd = new BabyDog();

        // Accessing methods from all levels
        bd.eat();   // Animal
        bd.bark();  // Dog
        bd.weep();  // BabyDog
    }
}