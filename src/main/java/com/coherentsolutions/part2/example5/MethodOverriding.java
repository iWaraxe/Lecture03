package com.coherentsolutions.part2.example5;

public class MethodOverriding {
    public static void main(String[] args) {

    }
}

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Triangle extends Shape {
    // Overriding the draw method
    @Override
    void draw() {
        System.out.println("Drawing a triangle");
    }
}



