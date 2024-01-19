package com.coherentsolutions.part2.example1;

public class TypePromotionExample {

    void show(int i) {
        System.out.println("Integer: " + i);
    }

    void show(byte b) {
        System.out.println("Byte: " + b);
    }

    void show(double d) {
        System.out.println("Double: " + d);
    }

    public static void main(String[] args) {
        TypePromotionExample obj = new TypePromotionExample();

        // Automatic type promotion
        obj.show(5);    // Calls the show(int i) method
        obj.show(5.5);  // Calls the show(double d) method
        obj.show((byte)5);  // Type promoted to int, calls show(int i)
        obj.show(5_000_000_000L);
        obj.show(5.5f);
    }
}

