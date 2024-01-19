package com.coherentsolutions.part1.example3;

class Student {
    String name;
    int age;

    // Copy constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    // Regular constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
