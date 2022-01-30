package com.ntpel.Week1;
import java.util.Scanner;

public class Exercise1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int result=0;
        int check=0;
        int rem;
        int original = n;
        while(n>0){
            rem = n%10;
            check = check + rem*rem*rem;
            n=n/10;
        }
        if(original == check){
            result = 1;
        }
        System.out.print(result);
    }
}
