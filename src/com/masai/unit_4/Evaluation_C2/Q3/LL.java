package com.masai.unit_4.Evaluation_C2.Q3;

import java.util.Scanner;

public class LL {
    Node head;
    Node last;
    int count;
    static class Node{
        int  data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }
  public void addFirst(int data){
        Node newNode= new Node(data);
      count++;
        if(head==null){
          head =newNode;
          last=newNode;
          return;
        }
        newNode.next=head;
        head=newNode;


  }
  public void addLast(int data){
      Node newNode= new Node(data);
      count++;
      if(head==null){
          head =newNode;
          last=head;
          return;
      }
      last.next=newNode;
      last=last.next;

  }
  public void DeleteFirst(){
        if(head==null){
            return;
        }
       head =head.next;
  }
    public void PrintList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node curNode=head;
        while (curNode!=null){
            System.out.print(curNode.data+"-->");
            curNode=curNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length of LinkList");
        LL m1=new LL();
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
            System.out.println("Enter Number ");
            int str= sc.nextInt();
          m1.addFirst(str);


        }
        m1.DeleteFirst();
        m1.PrintList();


    }
}
