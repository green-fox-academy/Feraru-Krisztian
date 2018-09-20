package com.greenfoxacademy.foxclub.controllers;
import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.services.ClubService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    ClubService clubService;

    public MainController(ClubService clubService) {
        this.clubService = clubService;
    }

    @RequestMapping("/")
    public String home(Model model,String name) {
        model.addAttribute("info", "/information");
        model.addAttribute("login", "/login");
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

    @RequestMapping("/login")
    public String getLogin() {
        return "login";
    }

    @PostMapping("/")
    public String postLogin(@RequestParam("name") String name) {
//        if (name == "") {
//            return "redirect:/login";
//        }
        clubService.addFoxToList(new Fox(name));
        return "redirect:/?name=" + name;
    }
}
