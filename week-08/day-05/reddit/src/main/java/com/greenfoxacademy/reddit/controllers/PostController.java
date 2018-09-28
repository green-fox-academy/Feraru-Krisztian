package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.services.PostServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {
    private final PostServiceImpl postService;

    public PostController(PostServiceImpl postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String index(Model model) {
        Iterable<Post> posts = postService.findAll();
        model.addAttribute("posts", posts);

        return "index";
    }

    @GetMapping("/{id}/upvote")
    public String voteUp(@PathVariable Long id) {
        postService.upVote(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/downvote")
    public String voteDown(@PathVariable Long id) {
        postService.downVote(id);
        return "redirect:/";
    }

    @PostMapping("/{id}/delete")
    public String deletePost(@PathVariable Long id) {
        postService.delete(id);
        return "redirect:/";
    }

}
