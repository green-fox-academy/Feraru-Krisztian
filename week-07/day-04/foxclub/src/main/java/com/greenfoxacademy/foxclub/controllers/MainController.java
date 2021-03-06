package com.greenfoxacademy.foxclub.controllers;
import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.services.ClubService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    ClubService clubService;

    public MainController(ClubService clubService) {
        this.clubService = clubService;
    }

    @RequestMapping("/")
    public String home(Model model,@RequestParam("name") String name) {
        model.addAttribute("info", "/information");
        model.addAttribute("nutritionStore", "/nutritionstore");
        model.addAttribute("trickCenter", "/trickcenter");
        model.addAttribute("login", "/login");
        model.addAttribute("name", name);
        Fox fox = clubService.getFoxFromList(name);
        model.addAttribute("fox", fox);
        if (fox == null) {
            return "redirect:/login";
        }
        return "index";
    }

    @RequestMapping("/information")
    public String info() {
        return "information";
    }

    @RequestMapping("/trickcenter")
    public String tricks(){
        return "tricks";
    }

    @RequestMapping("/nutritionstore")
    public String store(){
        return "nutrition";
    }
}
