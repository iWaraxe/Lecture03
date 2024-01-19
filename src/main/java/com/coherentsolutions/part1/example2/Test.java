package com.coherentsolutions.part1.example2;

class Animal {
    Animal() {
        System.out.println("Animal constructor called.");
    }
}

class Mammal extends Animal {
    Mammal() {
        super();  // Explicitly calling the parent class's constructor
        System.out.println("Mammal constructor called.");
    }
}

class Dog extends Mammal {
    Dog() {
        super();  // Explicitly calling the parent class's constructor
        System.out.println("Dog constructor called.");
    }
}

public class Test {
    public static void main(String[] args) {
        Dog myDog = new Dog();
    }
}
