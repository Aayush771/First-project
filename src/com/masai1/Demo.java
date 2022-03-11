package com.masai1;


import java.util.Scanner;

public class Demo{

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int  num1=Sc.nextInt();
        int num2=Sc.nextInt();
        int num3=Sc.nextInt();
        Demo m1= new Demo();
        m1.updateAndCompare(num1,num2,num3);
    }
    void updateAndCompare(int num1, int num2, int num3) {
        // Write code here

            System.out.println(num1>num2);
        num1 += num3;
        System.out.println(num1>num2);



    }

}

