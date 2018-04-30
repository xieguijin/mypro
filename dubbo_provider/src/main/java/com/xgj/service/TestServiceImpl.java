package com.xgj.service;

import com.xgj.entity.Demo;

public class TestServiceImpl implements  TestService {
    public String test(Demo demo) {
        System.out.println("!!!!");
        System.out.println(demo.toString());
        return demo.toString();
    }
}
