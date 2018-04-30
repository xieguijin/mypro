package com.xgj.service;

import com.xgj.entity.Demo;

public class TestServiceImpl implements  TestService {
    public String test(Demo demo) {
        System.out.println("!!!!");
        System.out.println(demo.toString());
        System.out.println("ahadhiad ");
        return demo.toString();
    }
}
