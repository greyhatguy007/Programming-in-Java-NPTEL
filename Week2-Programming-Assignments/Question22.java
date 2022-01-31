package com.ntpel.Week2;

class Printer {
    // This are the methods in class Printer
    public void print() {
        System.out.println("Hi! I class SCHOOL.");
    }
    public void print(String s) {
        System.out.println(s);
    }
}
public class Question22 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Hi! I am class STUDENT");
        printer.print();
    }
}
