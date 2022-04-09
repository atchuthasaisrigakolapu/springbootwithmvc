package com.example.spring.with.mvc.controller;

import com.example.spring.with.mvc.model.User;
import com.example.spring.with.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("user")
    public ModelAndView loadForm() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", new User());
        modelAndView.setViewName("UserView");
        return modelAndView;
    }

    @PostMapping("user")
    public ModelAndView handleSubmit(User user) {
        String status = userService.saveUser(user);
        System.out.println("User:" + user);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", status);
        modelAndView.setViewName("UserView");
        return modelAndView;
    }

}
