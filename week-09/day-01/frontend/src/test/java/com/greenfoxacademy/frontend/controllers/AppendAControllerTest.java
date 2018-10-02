package com.greenfoxacademy.frontend.controllers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppendAControllerTest {
    private AppendAController controller;

    @Before
    public void before(){
        controller = new AppendAController();
    }

    @Test
    public void addATest(){
        AppendAController.AppendA appendA = controller.addA("kuty");
        assertEquals("kutya", appendA.appended);
    }
}
