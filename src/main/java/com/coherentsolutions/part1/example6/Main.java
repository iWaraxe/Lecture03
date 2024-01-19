package com.coherentsolutions.part1.example6;

public class Main {
    public static void main(String[] args) {
        //Singleton singleton = new Singleton();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}
