package com.greenfoxacademy.workwithdependencies.services;

import com.greenfoxacademy.workwithdependencies.MyColor;
import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor {
    @Override
    public void printColor() {
        System.out.println("It is red in color...");
    }
}
