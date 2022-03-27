package com.masai.unit_4.week_3.Day_3.Q1;

import java.util.*;

public class Products {
    private int productId;
    private String procuctName;
    private double productPrice;


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProcuctName() {
        return procuctName;
    }

    public void setProcuctName(String procuctName) {
        this.procuctName = procuctName;
    }

    public Products(int productId, String procuctName, double productPrice) {
        this.productId = productId;
        this.procuctName = procuctName;
        this.productPrice = productPrice;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productId=" + productId +
                ", procuctName='" + procuctName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<Products> a1= new TreeSet<>();
        System.out.println("Enter Number of Products");
        int Num=sc.nextInt();
        System.out.println("Enter shorting technic 1 for id 2 for name and 3 for price ");
        int choice= sc.nextInt();
        if(choice==1){
            a1=new TreeSet<>(new ProductIdComp());
        }
        else if(choice==2){
            a1=new TreeSet<>(new ProductNameComp());
        }
        else if(choice==3){
            a1=new TreeSet<>(new procuctPriceComp());
        }

        for(int i=0;i<Num;i++){
            System.out.println("Enter Product id");
            int id=sc.nextInt();

            System.out.println("Enter Product Name");
            String name=sc.next();

            System.out.println("Enter Product Price");
            double price=sc.nextInt();
           Products p1=new Products(id,name,price);
            a1.add(p1);
        }
        System.out.println(a1.toString());

    }


}

