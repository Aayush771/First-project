package com.masai;

//save by A.java

class Main{
    public static void main(String[] args) {
        Bird b1= new parrot();
        b1.fly();
//        b1.(Bird)sing();
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
