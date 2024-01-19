package com.coherentsolutions.part2.example2;

public class VarargsOverload {

    // Method with varargs
    void show(int... numbers) {
        System.out.println("Varargs method called.");
    }

    // Method with two integer arguments
    void show(int a, int b) {
        System.out.println("Method with two integer arguments called.");
    }

    // This will cause a compilation error
    // void incorrectShow(int... numbers, int a) { }

    public static void main(String[] args) {
        VarargsOverload obj = new VarargsOverload();

        obj.show(1);       // Calls varargs method
        obj.show(1, 2);    // Calls method with two integer arguments
        obj.show(1, 2, 3); // Calls varargs method
        obj.show(1,2,3,4,5);



    }
}
