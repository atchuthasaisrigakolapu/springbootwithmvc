package com.example.spring.with.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CourseController {
    
    
    @GetMapping("course")
    public ModelAndView getCourseCost(@RequestParam("name") String name){
        String msgTxt = null;
        ModelAndView modelAndView = new ModelAndView();
        if(name.equalsIgnoreCase("java"))
            msgTxt = "5000";
        else if(name.equalsIgnoreCase("spring"))
            msgTxt = "6000";
        else
            msgTxt = "10000";

        modelAndView.addObject("msg", msgTxt);
        modelAndView.setViewName("courseView");
        return modelAndView;
    }
}

