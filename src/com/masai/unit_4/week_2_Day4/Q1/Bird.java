package com.masai.unit_4.week_2_Day4.Q1;

//save by A.java

class Main{
    public static void main(String[] args) {
        Bird b1= new parrot();
        b1.fly();
        parrot m1=(parrot)b1;
        m1.sing();
    }
}
public abstract class Bird {

    public abstract void fly();
}
class parrot extends Bird {

    @Override
    public void fly() {
        System.out.println("I am Flying");
    }
    public void sing(){
        System.out.println("I am Singing");
    }
}
