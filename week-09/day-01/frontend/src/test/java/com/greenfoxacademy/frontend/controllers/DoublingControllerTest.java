package com.greenfoxacademy.frontend.controllers;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DoublingControllerTest {
    private DoublingController controller;

    @Before
    public void before() {
        controller = new DoublingController();
    }

    @Test
    public void getDoublingTest(){
        DoublingController.Result result = controller.getDoubling(5);
        assertEquals(10, (long)result.result);
    }

    @Test
    public void getDoublingZeroTest(){
        DoublingController.Result result = controller.getDoubling(0);
        assertEquals(0, (long)result.result);
    }

    @Test
    public void getDoublingNegativeNumberTest(){
        DoublingController.Result result = controller.getDoubling(-5);
        assertEquals(-10, (long)result.result);
    }

    @Test
    public void getDoublingNullTest(){
        DoublingController.Result result = controller.getDoubling(null);
        assertEquals("Please provide an input!", result.error);
    }
}
