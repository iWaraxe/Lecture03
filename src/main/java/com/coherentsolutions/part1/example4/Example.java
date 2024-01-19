package com.coherentsolutions.part1.example4;

class Course {
    String subject;
}

class Student {
    Course course;

    // Shallow copy constructor
    Student(Student s) {
        this.course = s.course;
    }
}


public class Example {
    public static void main(String[] args) {

    }
}
