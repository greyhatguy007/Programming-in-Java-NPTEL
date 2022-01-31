package com.ntpel.Week2;

class School {
    // This is a method in class School
    public void print() {
        System.out.println("Hi! I class SCHOOL.");
    }
}
// This is the class named Student
class Student {
    // This is a method in class Student
    public void print() {
        System.out.println("Hi! I am class STUDENT");
    }
}


public class Question21 {
    public static void main(String[] args) {
        Student student = new Student();
        student.print();
        School school = new School();
        school.print();
    }
}
