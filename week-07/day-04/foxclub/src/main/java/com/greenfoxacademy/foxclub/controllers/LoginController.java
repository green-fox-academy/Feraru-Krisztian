package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.services.ClubService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    ClubService clubService;

    public LoginController(ClubService clubService) {
        this.clubService = clubService;
    }

    @RequestMapping("/login")
    public String getLogin() {
        return "login";
    }

    @PostMapping("/")
    public String postLogin(String name) {
        if (name.equals("")) {
            return "redirect:/login";
        }
        clubService.addFoxToList(new Fox(name));
        return "redirect:/?name=" + name;
    }
}
