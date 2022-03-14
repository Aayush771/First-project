package com.masai.unit_4.Evaluation_C4.Q3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void methodIncrement(int a,int b,int c){
        for(int i=a;i<b;i=i+c){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        int start=SC.nextInt();
        int end=SC.nextInt();
        int inc=SC.nextInt();
       if(end>start){
           System.out.println("Stirng error");
       }
       else {
           methodIncrement(start, end, inc);
       }
    }
}
