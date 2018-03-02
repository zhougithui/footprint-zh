package com.footprint.jdk8.instrument.test;

import com.footprint.jdk8.instrument.TransClass;

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