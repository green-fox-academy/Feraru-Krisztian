package com.greenfoxacademy.frontend.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class DoublingController {

    @GetMapping("/doubling")
    @ResponseBody
    public Result getDoubling(@RequestParam(required = false) Integer input) {
        Result doubling = new Result(input);
        if(input != null) {
            doubling.result = input * 2;
        } else if (input == null){
            doubling.error = "Please provide an input!";
        }
        return doubling;
    }

    public static class Result {
        public Integer received;
        public Integer result;
        public String error;

        Result(Integer received) {
            this.received = received;

        }
    }
}
