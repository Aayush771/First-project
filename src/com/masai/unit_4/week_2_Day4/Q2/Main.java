package com.masai.unit_4.week_2_Day4.Q2;

import java.util.Scanner;


 public class Main {
    private static String str;

    public static String  reversString(String str){
       String result ="";

       for(int i=str.length();i>0;i--){
           result+=str.charAt(i-1);
       }
       return result;

    }


    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String originalString= SC.next();
        String result = reversString(originalString);
        System.out.println("Original String is :"+ originalString);
        System.out.println("Reversed String is :"+ result);

    }
}
