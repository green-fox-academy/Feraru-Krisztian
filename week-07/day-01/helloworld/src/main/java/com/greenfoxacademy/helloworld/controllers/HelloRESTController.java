package com.greenfoxacademy.helloworld.controllers;

import com.greenfoxacademy.helloworld.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    AtomicLong atomicLong = new AtomicLong(0);
    @RequestMapping("/greeting")
    public Greeting greetsYou(@RequestParam(value = "name", required = false) String name) {
        return new Greeting(atomicLong.incrementAndGet(), "Hello, " + name);
    }
}
