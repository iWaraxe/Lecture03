package com.coherentsolutions.part2.example1;

public class AmbiguityExample {

    void show(int i, double d) {
        System.out.println("int and double: " + i + ", " + d);
    }

    void show(double d, int i) {
        System.out.println("double and int: " + d + ", " + i);
    }

    public static void main(String[] args) {
        AmbiguityExample obj = new AmbiguityExample();

        // This will cause ambiguity
        // obj.show(5, 7);  // Which method to call?

        // Resolving ambiguity by explicit casting
        obj.show((double) 5, 7);  // Calls show(double d, int i)

    }
}
