package com.footprint.dubbo.service.bill;

import com.footprint.dubbo.facade.bill.IBillService;
import org.springframework.stereotype.Service;

/**
 * @author hui.zhou 16:45 2018/2/9
 */
@Service
public class BillServiceImpl implements IBillService {

    @Override
    public String hello(String name) {
        System.out.println("hello " + name);
        return "hello " + name;
    }
}
