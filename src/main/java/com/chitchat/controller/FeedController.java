package com.chitchat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class FeedController {

    @PostMapping("/post")
    public String createPost() {
        return "redirect:/home";
    }

    @PostMapping("/follow/{id}")
    public String followUser(@PathVariable Long id) {
        return "redirect:/home";
    }

    @PostMapping("/like/{id}")
    public String likePost(@PathVariable Long id) {
        return "redirect:/home";
    }

    @PostMapping("/comment/{id}")
    public String commentPost(@PathVariable Long id) {
        return "redirect:/home";
    }

    @GetMapping("/profile")
    public String profile() {
        return "profile"; // create profile.html or redirect
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/login";
    }
}
