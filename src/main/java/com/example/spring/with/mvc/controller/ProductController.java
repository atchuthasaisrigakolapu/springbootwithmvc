package com.example.spring.with.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

    @GetMapping("product/{pid}")
    public ModelAndView getProductPrice(@PathVariable("pid") Integer productId ){
        String msgTxt = null;
        ModelAndView modelAndView = new ModelAndView();
        if(productId == 101)
            msgTxt = "100";
        else if(productId == 102)
            msgTxt = "200";
        else
            msgTxt = "300";
        modelAndView.addObject("msg", msgTxt);
        modelAndView.setViewName("productView");
        return modelAndView;
    }

}
