package com.example.spring.with.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

    @GetMapping("welcome")
    public  ModelAndView getWelcomeMessage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "Hai amma nanna");
        modelAndView.setViewName("welcome");
        return modelAndView;
    }

}
