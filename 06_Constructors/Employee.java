/*
 * OOP CONCEPT: Constructor Overloading
 * CONCEPT: Polymorphism (Compile-time)
 * PATTERN: Same constructor name, different parameters
 * PURPOSE: Initialize objects in different ways
 */

public class Employee {

    int empId;
    String empName;
    String role;

    // Constructor 1: Only ID
    Employee(int empId) {
        this.empId = empId;
        this.empName = "Not Assigned";
        this.role = "Not Assigned";
    }

    // Constructor 2: ID and Name
    Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
        this.role = "Not Assigned";
    }

    // Constructor 3: ID, Name, Role
    Employee(int empId, String empName, String role) {
        this.empId = empId;
        this.empName = empName;
        this.role = role;
    }

    void display() {
        System.out.println(empId + " " + empName + " " + role);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(101);
        Employee e2 = new Employee(102, "Alex");
        Employee e3 = new Employee(103, "Sam", "Developer");

        e1.display();
        e2.display();
        e3.display();
    }
}
