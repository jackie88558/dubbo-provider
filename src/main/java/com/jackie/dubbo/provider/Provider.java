package com.jackie.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;

public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"provider.xml"});
        context.start();
        System.out.println("provider started!");
        System.in.read(); // press any key to exit
    }
}
