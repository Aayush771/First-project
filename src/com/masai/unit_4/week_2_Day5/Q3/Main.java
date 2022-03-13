package com.masai.unit_4.week_2_Day5.Q3;

import java.util.Scanner;

public class Main {
    public Object HotelprovideFood(int amount){
        if(amount>1000){
            Hotel s1 = new TajHotel();
            return s1;
        }
        if(amount>200){
            RoadSideHotel s1 = new RoadSideHotel();
            return s1;
        }
        else
            return null;
  }
    public static void main(String[] args) {
      Main m1=new Main();
        Scanner Scan=new Scanner(System.in);
        System.out.println("Enter Amount");
        int amount=Scan.nextInt();
        Object x=m1.HotelprovideFood(amount);
        Hotel S2=new Hotel() {
            @Override
            public void ChickenBiryani() {
                
            }

            @Override
            public void masalaDosa() {

            }
        };
        System.out.println(x);
        System.out.println(S2);
    }
        }
