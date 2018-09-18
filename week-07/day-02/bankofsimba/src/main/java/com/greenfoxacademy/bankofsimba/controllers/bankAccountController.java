package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class bankAccountController {

    @RequestMapping("/show")
    public String count(Model model) {
        BankAccount simba = new BankAccount("Simba", 2000, "lion");
        model.addAttribute("newBankAccount", simba);
        return "show";
    }
}
