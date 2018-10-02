package com.greenfoxacademy.frontend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

    @GetMapping("/greeter")
    @ResponseBody
    public Greet startGreeting(@RequestParam(required = false) String name, String title) {
        Greet greet = new Greet(name, title);
        if (name == null) {
            greet.error = "Please provide a name!";
        }else if (title == null) {
            greet.error = "Please provide a title!";
        }
        return greet;
    }


    public static class Greet {
        public String name;
        public String title;
        public String welcome_message;
        public String error;

        Greet(String name, String title) {
            this.name = name;
            this.title = title;
            this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
        }
    }
}
