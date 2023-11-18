package com.driver;

public class Main {
   public static void main(String[] args) {
        // Task 3: Create an object of class RWOnly
        RWOnly obj = new RWOnly();

        // Task 4: Try setting a value to 'name' directly using obj
        // and also try printing it (Note: This will result in a compilation error)
        // obj.name = "John"; // Uncommenting this line will result in a compilation error
        // System.out.println(obj.name); // Uncommenting this line will result in a compilation error

        // Task 6: Try setting a value to 'name' using setter function and access it using getter function
        obj.setName("John");
        System.out.println("Name: " + obj.getName());
    }
}
