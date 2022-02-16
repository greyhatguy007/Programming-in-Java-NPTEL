package com.ntpel.Week4;

// Import the required package(s) and/or class(es)
import static java.lang.System.out;
import java.util.Scanner;

public class Question41 {
    public static void main(String[] args) {
        // Scanner object is created
        Scanner scanner = new Scanner(System.in);
        // Read String input using scanner class
        String courseName = scanner.nextLine();
        // Print the scanned String
        out.println("Course: " + courseName);
    }
}
