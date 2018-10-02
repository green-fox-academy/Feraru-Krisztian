package com.greenfoxacademy.frontend.controllers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreeterControllerTest {
    private GreeterController controller;

    @Before
    public void before(){
        controller = new GreeterController();
    }

    @Test
    public void startGreetingTest(){
        GreeterController.Greet greet = controller.startGreeting("Chriss", "boss");
        assertEquals("Oh, hi there Chriss, my dear boss!" , greet.welcome_message);
    }

    @Test
    public void startGreetingNoNameTest(){
        GreeterController.Greet greet = controller.startGreeting(null, "boss");
        assertEquals("Please provide a name!" , greet.error);
    }

    @Test
    public void startGreetingNoNameAndNoTitleTest(){
        GreeterController.Greet greet = controller.startGreeting(null, null);
        assertEquals("Please provide a name!", greet.error);
    }

    @Test
    public void startGreetingNoTitleTest(){
        GreeterController.Greet greet = controller.startGreeting("Chriss", null);
        assertEquals("Please provide a title!" , greet.error);
    }
}
