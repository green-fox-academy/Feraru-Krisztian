package com.greenfoxacademy.frontend.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class DoUntilController {

    @PostMapping("/dountil/{action}")
    @ResponseBody
    public Result doUntil(@PathVariable(required = false) String action, @RequestBody(required = false) Until until) {
        Result result = new Result();
        if ((until == null)) {
            result.error = "Please provide a number!";
            return result;
        }

        if (action.equals("sum")) {
            for (int i = 0; i <= until.until; i++) {
                result.result = result.result + i;
            }
        }

        if (action.equals("factor")) {
            result.result = 1;
            for (int i = 1; i <= until.until; i++) {
                result.result = result.result * i;
            }
        }

        return result;
    }

    private static class Until {
        public int until;

        Until(int until) {
            this.until = until;
        }

        Until() {
        }

    }

    private static class Result {
        public int result;
        public String error;

        Result() {
        }

    }

}
