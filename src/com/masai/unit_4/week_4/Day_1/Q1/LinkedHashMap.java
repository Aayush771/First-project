package com.masai.unit_4.week_4.Day_1.Q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap {
    public static void main(String[] args) {
        Map<String,String>hm=new java.util.LinkedHashMap<>();
        hm.put("Punjab","Chandigarh");
        hm.put("Jharkhand","Ranchi");
        hm.put("Bihar","Patna");
        hm.put("Delhi","New Delhi");
        hm.put("India","New Delhi");
        Set<Map.Entry<String,String>> keyValue= hm.entrySet();
        for(Map.Entry<String,String> me: keyValue){
            System.out.println(me.getKey()+" "+me.getValue());
        }

    }
}
