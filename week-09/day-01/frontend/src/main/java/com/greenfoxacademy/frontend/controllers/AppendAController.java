package com.greenfoxacademy.frontend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendAController {

    @GetMapping("/appenda/{appendable}")
    @ResponseBody
    public AppendA addA(@PathVariable(required = false)String appendable){
        AppendA appendA = new AppendA(appendable);
        return appendA;
    }


    private static class AppendA {
        public String appended;

        AppendA(String appended) {
            this.appended = appended + "a";
        }
    }

}
