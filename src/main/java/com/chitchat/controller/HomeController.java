package com.chitchat.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class HomeController {

    @GetMapping("/")
    public String root() {
        return "login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }
    
    @PostMapping("/signup")
    public String processSignup() {
        // TODO: persist user details (placeholder)
        return "redirect:/home";
    }

    @PostMapping("/login")
    public String processLogin() {
        // TODO: authenticate user (placeholder)
        return "redirect:/home";
    }
//  @PostMapping("/signup")
//     public String processSignup() {

//         // later: save user details here

//         return "redirect:/home";  // 👈 VERY IMPORTANT
//     }

    @GetMapping("/home")
    public String home() {
        return "home";
    }
}

