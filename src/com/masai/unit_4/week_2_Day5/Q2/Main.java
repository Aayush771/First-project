package com.masai.unit_4.week_2_Day5.Q2;

public class Main{
    public int[] findAndReturnPrimeNumbers(int[] arr){
        int index=0;
        int[] result=new int[2];
        for (int k : arr) {
            boolean isPrime = true;
            for (int j = 2; j < k; j++) {
                if (k % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            //print the number
            if (isPrime) {
             result[index]=k;
             index=index+1;


            }

        }

        return  result;
   }


    public static void main(String[] args){
        int[] arr = {10,12,5,50,11,14,15};
        Main m1=new Main();
        int[] result =m1.findAndReturnPrimeNumbers(arr);
        if(result.length!=0){
            for(int i:result){
                System.out.println(i);
            }

        }
        else {
            System.out.println("Prime number not found in the supplied Array");
        }
    }
}
