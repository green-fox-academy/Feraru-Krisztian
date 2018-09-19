package com.greenfoxacademy.workwithdependencies.controllers;

import com.greenfoxacademy.workwithdependencies.services.CaesarEncoderDecoder;
import com.greenfoxacademy.workwithdependencies.services.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilitiesController {

    UtilityService utilityService;
    CaesarEncoderDecoder Caesar;

    public UtilitiesController(UtilityService utilityService, CaesarEncoderDecoder Caesar) {
        this.utilityService = utilityService;
        this.Caesar = Caesar;
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

    @RequestMapping("/encoding")
    public String encoding(Model model, @RequestParam("text") String text){
        model.addAttribute("text", Caesar.caesarEncodeing(text, 1));
        return "text";
    }
    @RequestMapping("/decoding")
    public String decoding(Model model, @RequestParam("text") String text){
        model.addAttribute("text", Caesar.caesarDecodeing(text, 1));
        return "text";
    }
}
