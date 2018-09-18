package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class accountListController {

    BankAccount simba = new BankAccount("Simba", 2000, "lion");
    BankAccount bunny = new BankAccount("Bugs bunny", 1500, "rabbit");
    BankAccount tom = new BankAccount("Tom", 1000, "cat");
    BankAccount jerry = new BankAccount("Jerry", 1800, "mouse");
    BankAccount scooby = new BankAccount("Scooby Doo", 2500, "dog");
    ArrayList<BankAccount> listOfBankAccounts = new ArrayList<>(Arrays.asList(simba, bunny, tom, jerry, scooby));

    @RequestMapping("/list")
    public String listOfAccounts(Model model) {
        model.addAttribute("accountList", listOfBankAccounts);
        return "list";
    }
}
