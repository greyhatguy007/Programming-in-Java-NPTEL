package com.ntpel.Week1;
import java.util.Scanner;

public class Exercise1_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mark_avg;
        int result;
        int i;
        int s;
        //define size of array
        s = input.nextInt();
        //The array is defined "arr" and inserted marks into it.
        int[] arr = new int[s];
        for(i=0;i<arr.length;i++)
        {
            arr[i]=input.nextInt();
        }
        int total=0;
        result = arr[0];
        for(i=0;i<arr.length;i++)
        {
            total += arr[i];
            if(arr[i]>result){
                result = arr[i];
            }
        }
        mark_avg = total/s ;
        System.out.println(result);
        System.out.print(mark_avg);
    }
}
