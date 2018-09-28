package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.services.PostServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SubmitController {
    private final PostServiceImpl postService;

    public SubmitController(PostServiceImpl postService) {
        this.postService = postService;
    }

    @RequestMapping("/submit")
    public String getPostAdd() {
        return "submit";
    }

    @PostMapping("/")
    public String postAdd(String name, String url ) {
        postService.addPost(name, url);
        return "redirect:/";
    }
}
