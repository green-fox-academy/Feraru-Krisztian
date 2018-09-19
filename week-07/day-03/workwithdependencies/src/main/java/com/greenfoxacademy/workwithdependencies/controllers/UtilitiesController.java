package com.greenfoxacademy.workwithdependencies.controllers;

import com.greenfoxacademy.workwithdependencies.services.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilitiesController {

    UtilityService utilityService;

    public UtilitiesController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @RequestMapping("/useful")
    public String main(Model model) {
        model.addAttribute("coloredBackground", "/useful/colored");
        model.addAttribute("email", "/useful/email?email=is@this.valid");
        return "main";
    }

    @RequestMapping("/useful/colored")
    public String colorBG(Model model) {
        model.addAttribute("colorBG", utilityService.randomColor());
        return "coloredBG";
    }

    @RequestMapping("/useful/email")
    public String email(Model model, @RequestParam("email") String email) {
        model.addAttribute("emailvalid", utilityService.validateEmail(email));
        model.addAttribute("email", email);
        return "email";
    }
}
