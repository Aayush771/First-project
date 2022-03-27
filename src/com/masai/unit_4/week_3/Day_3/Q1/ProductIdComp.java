package com.masai.unit_4.week_3.Day_3.Q1;

import java.util.Comparator;

public class ProductIdComp implements Comparator<Products> {
    @Override
    public int compare(Products s1, Products s2) {
        return s1.getProductId() > s2.getProductId() ? +1:-1;
    }
}
