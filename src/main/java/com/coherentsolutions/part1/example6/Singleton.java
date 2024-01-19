package com.coherentsolutions.part1.example6;

public class Singleton {
    // Step 1: Create a private static instance of the class
    private static Singleton instance;

    // Step 2: Make the constructor private
    private Singleton() {
        // Initialization code
    }

    // Step 3: Provide a global point of access
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
