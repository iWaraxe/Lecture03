package com.coherentsolutions.intro;

// Live Coding: Show method overloading example
public class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers (Overloaded)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double numbers (Overloaded)
    public double add(double a, double b) {
        return a + b;
    }
}

