package com.coherentsolutions.part1.example5;

class Course {
    String subject;

    // Constructor
    Course(String subject) {
        this.subject = subject;
    }
}

class Student {
    Course course;

    // Deep copy constructor
    Student(Student s) {
        this.course = new Course(s.course.subject);
    }
}


public class Example {
    public static void main(String[] args) {

    }
}
