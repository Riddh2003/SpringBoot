package com.riddh.springboot.demo.myapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Autowired
    Laptop lap;
    public void code()
    {
        lap.complie();
        System.out.println("My name is Riddh Modi.");
    }
}
