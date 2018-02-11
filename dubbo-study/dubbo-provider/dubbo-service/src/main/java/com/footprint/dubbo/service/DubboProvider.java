package com.footprint.dubbo.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboProvider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"dubbo-service.xml"});
        context.start();
        System.in.read();
    }
}