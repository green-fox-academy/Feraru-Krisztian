package com.greenfoxacademy.bankofsimba.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class endPointController {

    @RequestMapping("/endpoint")
    public String endPoint(Model model) {
        String string = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
        model.addAttribute("text", string);
        return "endpoint";
    }
}
