package com.xgj.service;

import com.xgj.entity.Demo;

public class TestServiceImpl implements  TestService {
    public String test(Demo demo) {
        System.out.println("!!!--!11");
        System.out.println(demo.toString());
        System.out.println("ahadhiad ");
        return demo.toString();
    }
}
