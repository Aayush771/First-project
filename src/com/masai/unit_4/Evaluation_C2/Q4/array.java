package com.masai.unit_4.Evaluation_C2.Q4;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length");
        int N=sc.nextInt();
        sc.nextLine();
        String arr;
        arr=sc.nextLine();

        String[] arr1=arr.split(" ");
       int[] arr2=new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i]=Integer.parseInt(arr1[i]);

        }
        System.out.println(Arrays.toString(arr2));
    }

}
