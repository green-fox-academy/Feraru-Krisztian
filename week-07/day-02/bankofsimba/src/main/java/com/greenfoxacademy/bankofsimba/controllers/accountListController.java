package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class accountListController {

    BankAccount simba = new BankAccount("Simba", 2000, "lion", true);
    BankAccount bunny = new BankAccount("Bugs bunny", 1500, "rabbit", false);
    BankAccount tom = new BankAccount("Tom", 1000, "cat", false);
    BankAccount jerry = new BankAccount("Jerry", 1800, "mouse", false);
    BankAccount scooby = new BankAccount("Scooby Doo", 2500, "dog", false);
    ArrayList<BankAccount> listOfBankAccounts = new ArrayList<>(Arrays.asList(simba, bunny, tom, jerry, scooby));

    @RequestMapping("/list")
    public String listOfAccounts(Model model) {
        model.addAttribute("accountList", listOfBankAccounts);
        return "list";
    }
}
