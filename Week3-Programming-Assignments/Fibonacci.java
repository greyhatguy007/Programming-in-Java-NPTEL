package com.ntpel.Week3;

import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fib(n));
    }
    //Template code:
    static int fib(int n) {
        int j=n-1;
        if( j == 0 )
        {
            return 0;
        }
        else if( j == 1 )
        {
            return 1;
        }
        else
        {
            return (fib(n-2)+fib(n-1));
        }
    }
}