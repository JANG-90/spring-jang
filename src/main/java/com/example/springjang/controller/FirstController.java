package com.example.springjang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/greetings")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "장성우");
        return "greetings";
    }

    @GetMapping("/bye")
    public String byebye(Model model){
        model.addAttribute("username","장성우");
        return "byebye";
    }
}
