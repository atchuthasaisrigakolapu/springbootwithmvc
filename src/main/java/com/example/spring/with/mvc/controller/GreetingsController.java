package com.example.spring.with.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingsController {

    @GetMapping("wishes")
    public String greetMessage(Model model){
        model.addAttribute("msg", "Hi Good morning amma nanna");
        return "greetView";
    }

}
