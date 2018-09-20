package com.greenfoxacademy.foxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("info", "/information");
        model.addAttribute("login", "/login");
        return "index";
    }

    @RequestMapping("/login")
    public String login(Model model) {
        model.addAttribute("login", "/login");
        return "login";
    }

    @RequestMapping("/information")
    public String info() {
        return "information";
    }
}
