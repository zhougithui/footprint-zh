package com.zmy.instrument.test;

import com.zmy.instrument.TransClass;

public class TestMainInJar { 
    public static void main(String[] args) throws InterruptedException { 
        System.out.println(new TransClass().getNumber("zh"));
        int count = 0; 
        while (true) { 
            Thread.sleep(500); 
            count++; 
            System.out.println(new TransClass().getNumber("zh")); 
            if (count >= 10) { 
                break; 
            } 
        } 
    } 
 }