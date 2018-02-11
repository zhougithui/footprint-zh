package com.footprint.bill;

import com.footprint.dubbo.facade.bill.IBillService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BillConsumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"bill-consumer.xml"});
        context.start();
        // obtain proxy object for remote invocation
        IBillService demoService = context.getBean(IBillService.class);
        // execute remote invocation
        String hello = demoService.hello("world");
        // show the result
        System.out.println(hello);
    }
}