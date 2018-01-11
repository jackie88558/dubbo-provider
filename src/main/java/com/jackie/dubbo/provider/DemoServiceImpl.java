package com.jackie.dubbo.provider;

import com.jackie.dubbo.api.DemoService;

public class DemoServiceImpl implements DemoService {
    public String echo(String words) {
        return "provider got your echo: " + words;
    }
}
