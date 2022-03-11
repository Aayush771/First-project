package com.masai;

//save by A.java

class A{
    void msg(){
        System.out.println("Hello");
    }
}

//save by B.java


 abstract class B{
    public static void main(String args){
        A obj = new A();
        obj.msg();
    }
}
