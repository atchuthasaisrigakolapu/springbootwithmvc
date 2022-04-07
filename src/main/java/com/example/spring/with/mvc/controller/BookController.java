package com.example.spring.with.mvc.controller;

import com.example.spring.with.mvc.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {

    @GetMapping("book")
    public ModelAndView getBookData(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("book",Book.builder().bookId(101).bookName("java").bookPrice(100.0).build());
        modelAndView.setViewName("bookView");
        return modelAndView;
    }

}
