package com.coherentsolutions.part1.example1;

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name);  // Calling the parent class's constructor
        this.breed = breed;
    }
}
